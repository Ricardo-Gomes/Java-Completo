package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaRepetitivaForExercicio6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite o valor de N: ");
		n = scanner.nextInt();

		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		
			
		scanner.close();
	}
}
