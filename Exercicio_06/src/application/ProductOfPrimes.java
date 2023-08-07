package application;

public class ProductOfPrimes {
	public static void main(String[] args) {
		float product = 1.0f;
		for (int i = 15; i < 30; i++) {
			if (i % 2 == 1) {
				product *= i;
			}
		}
		System.out.println("O produto dos ímpares de 15 a 30 é: " + product);
	}
}
