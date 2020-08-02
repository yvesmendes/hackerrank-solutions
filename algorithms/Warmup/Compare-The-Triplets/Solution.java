import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        validateInput(a0, a1, a2, b0, b1 ,b2);
        
        Integer[] scoresA = {a0, a1, a2};
        Integer[] scoresB = {b0, b1, b2};
        
        calculateValue(scoresA, scoresB);
            
    }

    private static void calculateValue(Integer[] scoresA, Integer[] scoresB){
        Integer scoreA = 0;
        Integer scoreB = 0;    
        
        if(scoresA.length != scoresB.length){
            throw new IllegalArgumentException();
        }
        
        for(int i = 0; i < scoresA.length; i++){
            if(scoresA[i] > scoresB[i]){
                scoreA++;
            }else if(scoresA[i] < scoresB[i]){
                scoreB++;
            } 
        }
        
        System.out.println(scoreA+" "+ scoreB);
    }
    
    private static void validateInput(Integer ... inputs){
        for(Integer i : inputs){
            if(i < 0 || i > 100){
                throw new IllegalArgumentException();
            }
        }
    }
}
