//import com.google.gson.Gson;
//
//import java.io.IOException;
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class APICall {
//    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
//        HttpClient httpClient = HttpClient.newHttpClient();
//        Gson gson = new Gson();
////POST
////        UserRequest userRequest = new UserRequest();
////        userRequest.setName("soma");
////        userRequest.setAdmin(false);
////        userRequest.setNumber("12348");
//
////        String jsonRequest = gson.toJson(userRequest);
////        System.out.println(jsonRequest);
////        HttpRequest postRequest = HttpRequest.newBuilder().uri(new URI("http://localhost:8080/saveUser")).header("Content-Type", "application/json").POST(HttpRequest.BodyPublishers.ofString(jsonRequest)).build();
//
////        HttpResponse<String> postResponse = httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());
////        System.out.println("Post response :" + postResponse.body());
//
//        //Get
//        HttpRequest getRequest = HttpRequest.newBuilder().uri(new URI("http://localhost:8080/getAllUsers")).build();
//        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
//        String responseBody = getResponse.body();
//        System.out.println("Response body:" + responseBody);
//        // Deserialize JSON array into an array of UserResponse objects
//        UserReponse[] userResponses = gson.fromJson(responseBody, UserReponse[].class);
//
//        // Convert the array to a list for easier manipulation
//        List<UserReponse> userList = Arrays.asList(userResponses);
//
//        // Specify the name to filter
//        String nameToFilter = "raja";
//
//        // Filter the list by the specified name
//        List<UserReponse> filteredUsers = userList.stream().filter(user -> user.getName().equals(nameToFilter)).collect(Collectors.toList());
//
//        // Print the filtered users
//        System.out.println("Filtered Users:");
//        for (UserReponse users : filteredUsers) {
//            System.out.print(users.getName() + "-");
//            System.out.print(users.getAdmin() + "-");
//            System.out.print(users.getNumber() + "-");
//            System.out.print(users.getUserid());
//            System.out.println();
//        }
//    }
//}
