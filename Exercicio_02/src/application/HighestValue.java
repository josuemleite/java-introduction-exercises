package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HighestValue {

	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			
			double numberA = sc.nextDouble();
			double numberB = sc.nextDouble();
			
			if (numberA > numberB) {
				System.out.printf("O número %.2f é maior que o número %.2f!\n", numberA, numberB);
			} else {
				System.out.printf("O número %.2f é maior que o número %.2f!\n", numberB, numberA);
			}
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida. Digite um número válido.");
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
