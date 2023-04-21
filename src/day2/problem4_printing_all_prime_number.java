package day2;

import java.util.Scanner;

public class problem4_printing_all_prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----PROBLEM 4-----");
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        System.out.println("Prime numbers up to " + num + " are:");
        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

    }
}
