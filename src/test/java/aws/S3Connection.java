package aws;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3Connection {
    public static void main(String[] args) {
        AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                .withCredentials(new ProfileCredentialsProvider())
                .withRegion(Regions.AP_SOUTH_1)
                .build();
        ObjectListing objectListing = s3Client.listObjects("user-demo-data");
        for (S3ObjectSummary objectSummary : objectListing.getObjectSummaries()) {
            System.out.println("Object Key: " + objectSummary.getKey());
            // If you want to read the content of each object, you can do it like this:
            S3Object object = s3Client.getObject("user-demo-data", objectSummary.getKey());
            displayTextInputStream(object.getObjectContent());
        }
    }

    private static void displayTextInputStream(S3ObjectInputStream input) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
