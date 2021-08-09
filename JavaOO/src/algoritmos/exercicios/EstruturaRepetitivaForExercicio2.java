package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaRepetitivaForExercicio2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n; 
		int in = 0;
		int out = 0;
		int x;
		
		System.out.println("Digite um valor: ");
		n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {

			x = scanner.nextInt();
			if (x >= 10 && x <= 20) {
				 in += 1;
			}else {
				out += 1;
			}
		}
		
		System.out.println(" in -> " + in);
		System.out.println(" out -> " + out);
		
		scanner.close();
	}
}
