package algoritmos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialExercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double raio, resultado, pi = 3.14159;
		
		System.out.println("Digite o valor do Raio ");
		raio = scanner.nextDouble();

		resultado = pi * raio * raio;
		
		System.out.printf("Resultado = %.4f%n ", resultado);
		
		scanner.close();
	}

}
