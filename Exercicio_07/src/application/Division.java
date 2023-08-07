package application;

public class Division {
	public static void main(String[] args) {
		double result;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				result = i / 2f;
				System.out.printf("%d/2 = %.2f\n", i, result);
			}
		}
	}
}
