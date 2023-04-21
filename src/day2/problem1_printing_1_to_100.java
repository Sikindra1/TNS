package day2;

public class problem1_printing_1_to_100 {
    public static void main(String[] args) {
        System.out.println("-----PROBLEM 1-----");
        System.out.println("All Even number from 1 to 100");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
