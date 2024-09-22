import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int lineNumber = 1;

        while ((line = br.readLine()) != null) {
            System.out.printf("%d %s%n", lineNumber, line);
            lineNumber++;
        }
    }
}
