import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import javax.print.attribute.HashAttributeSet;

public class Solution {

    public static final Integer INITIAL_VALUE = 1;
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> sockMap = new HashMap<>();

        Integer actualValue = null;
        Integer total = 0;
        for(Integer value : ar){
            actualValue = sockMap.get(value);

            if(actualValue == null){
                actualValue = INITIAL_VALUE;
            }else{
                actualValue++;
            }
            sockMap.put(value, actualValue);

            if(actualValue % 2 == 0){
                total++;
            }
        }

        
        return total;   

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
