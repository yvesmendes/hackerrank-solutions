import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static final String BEFORE_HOUR = "AM";
    private static final String AFTER_HOUR = "PM";
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        
        String[] arrayHour = time.split(":");
        
        if(arrayHour.length != 3){
            throw new IllegalArgumentException();                                
        }
        
        validateAndFormatHour(arrayHour);
    }
    
    private static void validateAndFormatHour(String[] arrayHour){
        String typeHour = arrayHour[2].substring(arrayHour[2].length()-2, arrayHour[2].length());
        Integer hour = Integer.parseInt(arrayHour[0]);
        String middleValue = arrayHour[1];
        String endValue = arrayHour[2];
        

        if(hour < 0 || hour > 24){
            throw new IllegalArgumentException();                                
        }
        
        switch(typeHour){
            case BEFORE_HOUR:
                if(hour >= 12){
                    hour -= 12;                    
                }
            
                System.out.print("0"+hour+":"+middleValue+":"+endValue.replaceAll(BEFORE_HOUR,""));
                break;
            case AFTER_HOUR: 
                if(hour < 12){
                    hour += 12;
                }            

                System.out.print(hour+":"+middleValue+":"+endValue.replaceAll(AFTER_HOUR,""));
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}
