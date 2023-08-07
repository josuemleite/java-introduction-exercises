package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WordSorter {
	public static void main(String[] args) {
        Scanner sc = null;
        
        try {
        	sc = new Scanner(System.in);
        	
        	System.out.print("Digita a primeira palavra: ");
            String word1 = sc.next();

            System.out.print("Digita a segunda palavra: ");
            String word2 = sc.next();

            System.out.println("As palavras em ordem alfabética são:");
            if (word1.compareTo(word2) < 0) {
                System.out.println(word1);
                System.out.println(word2);
            } else {
                System.out.println(word2);
                System.out.println(word1);
            }

            String longerWord = word1.length() > word2.length() ? word1 : word2;
            System.out.println("A palavra com maior número de caracteres é: " + longerWord);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida.");
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
