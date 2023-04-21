package day2;

import java.util.Scanner;

public class problem8_perfetct_square {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        double sqrtNum = Math.sqrt(num);

        if (sqrtNum == Math.floor(sqrtNum)) {
            System.out.println(num + " is a perfect square!");
        } else {
            System.out.println(num + " is not a perfect square.");
        }

        scanner.close();

    }
}
