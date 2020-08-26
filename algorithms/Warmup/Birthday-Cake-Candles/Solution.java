import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] arr) {

        Map<Integer, Integer> sum = new HashMap();
        int actualNumber = Integer.MIN_VALUE;
        int maxTimes = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(sum.containsKey(arr[i])){
                sum.put(arr[i],sum.get(arr[i])+1);
            }else{
                sum.put(arr[i],1);
            }
            if(sum.get(arr[i]) > maxTimes){
                maxTimes = sum.get(arr[i]);
                actualNumber = arr[i];
            }
        }

        return maxTimes;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

