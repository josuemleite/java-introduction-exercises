package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = null;

		try {
			sc = new Scanner(System.in);

			int number = sc.nextInt();

			System.out.println("Números primos menores que " + number + ":");
			for (int i = 1; i < number; i++) {
				if (isPrime(i)) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida. Digite um número válido.");
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

	public static boolean isPrime(int num) {
		if (num <= 0) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
