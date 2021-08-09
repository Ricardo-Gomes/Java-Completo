package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaRepetitivaForExercicio4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n;
		double a;
		double b;
		double media;
		
		System.out.println("Digite o numero de casos: ");
		n = scanner.nextInt();
		

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o valor de A: ");
			a = scanner.nextDouble();
			
			System.out.println("Digite o valor de B: ");
			b = scanner.nextDouble();
			
			if (b == 0) {
				System.out.println("Divisão impossivel !!!");
			} else {
				media = a / b;
				System.out.println("Media -> " + media);
			}
			
		}
		scanner.close();
	}
}
