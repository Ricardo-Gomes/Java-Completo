package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaRepetitivaForExercicio7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n;
		int primeiro;
		int segundo;
		int terceiro;
		
		System.out.println("Digite o valor de N: ");
		n = scanner.nextInt();

		for (int i=1; i<=n; i++) {
			primeiro = i;
			segundo = i * i;
			terceiro = i * i * i;
			System.out.println("Primeiro -> " + primeiro + " | " + "Segundo -> " + segundo + " | " + "Terceiro -> " + terceiro);
		}
		
			
		scanner.close();
	}
}
