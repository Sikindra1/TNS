package day2;

import java.util.Scanner;

public class problem10_vowel_count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String user_input = scanner.nextLine();
        System.out.println("The number of vowels in the string is: " + countVowels(user_input));
    }

    public static int countVowels(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int numVowels = 0;
        for (char c : str.toCharArray()) {
            if (isVowel(c, vowels)) {
                numVowels++;
            }
        }
        return numVowels;
    }

    public static boolean isVowel(char c, char[] vowels) {  // Convert the character to lowercase
        c = Character.toLowerCase(c);
        for (char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }
}
