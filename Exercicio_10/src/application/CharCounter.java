package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CharCounter {
	public static void main(String[] args) {
        Scanner sc = null;

        try {
            sc = new Scanner(System.in);

            System.out.print("Digita uma palavra ou frase: ");
            String input = sc.nextLine();

            int vowelCount = countVowels(input);
            int spaceCount = countSpaces(input);
            int consonantCount = countConsonants(input);

            System.out.println("Quantidade de vogais: " + vowelCount);
            System.out.println("Quantidade de espaços em branco: " + spaceCount);
            System.out.println("Quantidade de consoantes: " + consonantCount);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida.");
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }

    public static int countVowels(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (Character.isWhitespace(c)) {
                count++;
            }
        }
        return count;
    }

    public static int countConsonants(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c) && !isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char c) {
        char lowerC = Character.toLowerCase(c);
        return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u';
    }
}
