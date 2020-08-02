import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] arrFinal = leftRotationArray(a, d);

        for(int i = 0; i < arrFinal.length; i++){
            System.out.print(arrFinal[i]+" ");
        }
        scanner.close();
    }

        private static int[] leftRotationArray(int[] arr, int numberOfRotations){
            int[] a = arr.clone();
            int firstValue = 0;
            for(int i = 0; i < numberOfRotations; i++){  
                firstValue = a[0];  
            
                for(int z = 0; z < a.length-1; z++){  
                    a[z] = a[z+1];  
                }  
                a[a.length-1] = firstValue;  
            }

            return a;
    }
}


