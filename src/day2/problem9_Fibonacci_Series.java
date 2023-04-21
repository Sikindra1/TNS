package day2;

import java.util.Scanner;

public class problem9_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Print Fibonacci sequence up to n
        int prev1 = 0, prev2 = 1, curr;
        System.out.print("Fibonacci sequence up to " + n + ": ");
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(prev1 + " ");
            } else if (i == 1) {
                System.out.print(prev2 + " ");
            } else {
                curr = prev1 + prev2;
                System.out.print(curr + " ");
                prev1 = prev2;
                prev2 = curr;
            }
        }
        scanner.close();
    }
}
