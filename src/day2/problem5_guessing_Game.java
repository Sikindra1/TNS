package day2;

import java.util.Random;
import java.util.Scanner;

public class problem5_guessing_Game {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Guess the number between 1 and 100: ");
            guess = scanner.nextInt();
            if (guess > randomNumber) {
                System.out.println("Too high! Guess lower.");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Guess higher.");
            }
        } while (guess != randomNumber);

        System.out.println("Congratulations! You guessed the number.");


    }
}
