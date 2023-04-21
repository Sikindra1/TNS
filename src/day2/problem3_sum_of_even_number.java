package day2;

import java.util.Scanner;

public class problem3_sum_of_even_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----PROBLEM 3-----");
        System.out.print("Enter any positive number: ");
        int userinput1 = input.nextInt();
        int range;
        int sum = 0;
        if (userinput1 % 2 == 0) {
            range = userinput1 - 1;
        } else {
            range = userinput1;
        }
        System.out.println("Printing sum of all odd number from " + userinput1 + " to 1");
        for (int i = 1; i <= range; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nSum of all odd number : " + sum);

    }
}
