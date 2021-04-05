import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumBribes function below.
    // https://www.hackerrank.com/challenges/new-year-chaos/problem
    // Author: Chan Kim
    static void minimumBribes(int[] q) {
        int personBribe = 0;
        int totalBribe = 0;

        for (int i = q.length - 1; i >= 0; i--) {
            // Check if there is a person who have bribed more than 2 people
            personBribe = q[i] - (i + 1);
            if (personBribe > 2) {
                System.out.println("Too chaotic");
                return;
            }

            for (int k = Math.max(0, q[i] - 2); k < i; k++) {
                if (q[k] > q[i]) {
                    totalBribe++;
                }
            }
        }
        System.out.println(totalBribe);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
