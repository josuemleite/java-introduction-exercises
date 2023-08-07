package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			
			String word = sc.next();
			
			if (isPalindrome(word)) {
	            System.out.println(word + " é um palíndromo.");
	        } else {
	            System.out.println(word + " não é um palíndromo.");
	        }
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida.");
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
