package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FuelConsumption {
	public static void main(String[] args) {
        Scanner sc = null;

        try {
        	sc = new Scanner(System.in);
        	
        	int totalKilometers = 0;
            int totalLiters = 0;
            int tankCount = 0;
            
            while (true) {
                System.out.print("Digita os quilômetros dirigidos (ou -1 para encerrar): ");
                int kilometers = sc.nextInt();

                if (kilometers == -1) {
                    break;
                }

                System.out.print("Digita a quantidade de litros de gasolina utilizados: ");
                int liters = sc.nextInt();

                double consumption = (double) kilometers / liters;

                System.out.println("Consumo: " + consumption + " km/l");

                totalKilometers += kilometers;
                totalLiters += liters;
                tankCount++;
            }

            double overallConsumption = (double) totalKilometers / totalLiters;
            System.out.println("------------------------------------------------------");
            System.out.println("Total de quilômetros dirigidos: " + totalKilometers);
            System.out.println("Total de litros de gasolina utilizados: " + totalLiters);
            System.out.println("Consumo médio geral: " + overallConsumption + " km/l");
            System.out.println("Total de tanques cheios registrados: " + tankCount);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir apenas números inteiros.");
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
