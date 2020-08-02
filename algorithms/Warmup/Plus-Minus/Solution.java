import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        Integer actualValue = null;
        Float totalNegatives = 0.000000f;
        Float totalPositives = 0.000000f;
        Float totalZeros = 0.000000f;
        
        for(int arr_i=0; arr_i < n; arr_i++){
            actualValue = in.nextInt();
            if(actualValue < 0){
                totalNegatives++;
            }else if(actualValue > 0){
                totalPositives++;
            }else{
                totalZeros++;
            }
            arr[arr_i] = actualValue;
        }
        
        if(totalNegatives > 0){
            totalNegatives /= n;
        }
        
        if(totalPositives > 0){
            totalPositives /= n;
        }
        
        if(totalZeros > 0){
            totalZeros /= n;
        }
        
        System.out.println(String.format("%.6f", totalPositives));
        System.out.println(String.format("%.6f", totalNegatives));
        System.out.println(String.format("%.6f", totalZeros));
    }
}
