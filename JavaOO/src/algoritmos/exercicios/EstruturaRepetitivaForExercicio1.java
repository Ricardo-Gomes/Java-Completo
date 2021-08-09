package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaRepetitivaForExercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int x ;
		
		System.out.println("Digite um valor: ");
		x = scanner.nextInt();
		
		for (int i = 1; i < x; i++) {

			if (i % 2 != 0) {
				System.out.println("Valores Impares -> " + i);
			}
		}
		
		scanner.close();
	}
}
