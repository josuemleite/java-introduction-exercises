package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MilesToKilometers {
	public static void main(String[] args) {
		Scanner sc = null;

		try {
			sc = new Scanner(System.in);

			float miles = sc.nextFloat();
			
			float kilometers = miles * 1.609f;
			
			System.out.printf("%.2f milhas são %.2f quilômetros!\n", miles, kilometers);
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida. Digite um número válido.");
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
