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
        Integer valorFinal = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            Integer valor = in.nextInt();
            arr[arr_i] = valor;
            valorFinal += valor;
        }
        
        System.out.println(valorFinal);

    }
}
