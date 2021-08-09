package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaRepetitivaForExercicio3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n;
		double a;
		double b;
		double c;
		double media;
		
		System.out.println("Digite o numero de casos: ");
		n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Digite o valor de A: ");
			a = scanner.nextDouble();
			
			System.out.println("Digite o valor de B: ");
			b = scanner.nextDouble();
			
			System.out.println("Digite o valor de C: ");
			c = scanner.nextDouble();
			
			media = (a * 2.0 + b * 3.0 + c * 5.0) / 10;
			
			System.out.println("Media -> " + media);
		}
		scanner.close();
	}
}
