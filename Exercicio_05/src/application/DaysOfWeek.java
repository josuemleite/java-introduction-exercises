package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DaysOfWeek {
	public static void main(String[] args) {
		Scanner sc = null;

		try {
			sc = new Scanner(System.in);

			String[] daysOfWeek = { "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado", "Domingo" };

			int number = sc.nextInt();

			if (number >= 1 && number <= 7) {
	            String dayOfWeek = daysOfWeek[number - 1];
	            System.out.println("Dia da semana correspondente: " + dayOfWeek);
	        } else {
	            System.out.println("Número inválido. Digite um número de 1 a 7.");
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
