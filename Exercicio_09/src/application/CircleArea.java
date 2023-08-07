package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
        Scanner sc = null;

        try {
            sc = new Scanner(System.in);

            System.out.print("Digite o raio do círculo: ");
            double radius = sc.nextDouble();

            double area = calculateCircleArea(radius);

            System.out.println("A área do círculo é: " + Math.round(area));
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Digite um número válido para o raio.");
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
