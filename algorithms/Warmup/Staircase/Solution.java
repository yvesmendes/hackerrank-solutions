import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static final String SYMBOL = "#";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        StringBuilder sb = new StringBuilder(n-1);
        
        for(int i =0; i < n; i++){
            sb.append(" ");
        }
        
        for(int i =0; i < n; i++){
            sb.replace(i, i+1, SYMBOL);
            System.out.println(sb.reverse().toString());
            sb.reverse();
        }
    }
}
