import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        String[] arr = s.split("(?<!^)");
        int actualLevel = 0;
        boolean isCounting = false;
        boolean isSeaLevel = true;
        int total = 0;
        for(String direction : arr){
            actualLevel += Direction.getDirection(direction).getValue();
            isSeaLevel = actualLevel == 0;

            if(actualLevel < 0){
                isCounting = true;
            }

            if(isCounting && isSeaLevel){
                total++;
                isCounting = false;
            }
        }

        return total;
    }
    
    private enum Direction{
        UP("U",1),
        DOWN("D",-1),
        DEFAULT("",0);

        private int value;
        private String directionValue;
        private Direction(String direction, Integer value){
            this.value = value;
            this.directionValue = direction;
        }

        public Integer getValue(){
            return this.value;
        }

        public String getDirectionValue() {
            return this.directionValue;
        }
        public static Direction getDirection(String direction){
            for(Direction d : Direction.values()){
                if(d.getDirectionValue().equals(direction)){
                    return d;
                }
            }

            return Direction.DEFAULT;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
