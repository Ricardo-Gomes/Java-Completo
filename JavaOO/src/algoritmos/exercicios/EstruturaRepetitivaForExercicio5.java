package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaRepetitivaForExercicio5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n;
		int fatorial = 1;
		
		System.out.println("Digite o valor de N: ");
		n = scanner.nextInt();

		for (int i=1; i<=n; i++) {
			fatorial = fatorial * i;
		}
		
		System.out.println(fatorial);
			
		scanner.close();
	}
}
