
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        List<String> arr = new ArrayList<>(Arrays.asList(a.split("(?<!^)")));
        List<String> arr2 = new ArrayList<>(Arrays.asList(b.split("(?<!^)")));
        Iterator<String> iter = arr.iterator();
        
        while (iter.hasNext()) {
            String s = iter.next();

            if (arr2.contains(s)) {
                arr2.remove(arr2.indexOf(s));
                iter.remove();
            }
        }

        return (arr.size()) +  (arr2.size());
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
