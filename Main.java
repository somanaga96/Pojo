import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        int[] arr = {1, 2, 3, 4, 8, 5, 10};
        int asInt = Arrays.stream(arr).max().getAsInt();
        System.out.println(asInt);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == asInt) {
                continue;
            }
            int j = 0;
            for (j = 1; j <= asInt - arr[i]; j++) {
                System.out.print(arr[i]);
            }
            System.out.print("-" + (--j) + "times");
            System.out.println();
        }
    }
}
