package day1;

import java.util.Scanner;

public class program_basic_solution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //        1. Input a year and find whether it is a leap year or not.

        System.out.println("Enter any year to check Leap Year :");
        int year = input.nextInt();
        if (year % 4 == 0 && year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " is Leap Year.");
            } else {
                System.out.println(year + " is Not Leap Year.");
            }
        }else {
            System.out.println(year + " is Not Leap Year.");

        }


//        2. Take two numbers and print the sum of both.

        int num1 = 55;
        int num2 = 505;
        System.out.println("Sum of two number : " + num1 + num2);

//        3. Take a number as input and print the multiplication table for it.

        System.out.print("Enter any number to print table :");
        int table = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " X " + i + " = " + table * i);
        }

//        4. Take 2 numbers as inputs and find their HCF.

        System.out.println("Enter any two number to find LCM and HCF");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        // initially set to gcd
        int hcf = 1;

        for (int i = 1; i <= number1 && i <= number2; ++i) {
            // check if i perfectly divides both number1 and number2
            if (number1 % i == 0 && number2 % i == 0) hcf = i;
        }
        System.out.println("GCD of " + number1 + " and " + number2 + " is " + hcf);


        // 5. Write a program to print whether a number is even or odd, also take input.

        System.out.print("Enter any number : ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else System.out.println("Odd");


        // 6. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
        int sum = 0;
        String num;

        while (true) {
            System.out.print("Enter a number to add or 'x' to exit: ");
            num = input.nextLine();

            if (num.equals("x")) {
                break;
            } else {
                sum += Integer.parseInt(num);
            }
        }

        System.out.println("The sum of all the numbers entered is: " + sum);


        //closing scanner
        input.close();
    }


}
