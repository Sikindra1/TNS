package day2;

import java.util.Scanner;

public class problem2_printing_all_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----PROBLEM 2-----");
        System.out.println("Enter any number:");
        int userinput = input.nextInt();
        for (int i = userinput; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
