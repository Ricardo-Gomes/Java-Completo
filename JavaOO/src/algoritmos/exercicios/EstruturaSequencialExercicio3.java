package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaSequencialExercicio3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a , b, c, d, diferenca;
		
		System.out.println("Digite o valor de A ");
		a = scanner.nextInt();
		
		System.out.println("Digite o valor de B ");
		b = scanner.nextInt();
		
		System.out.println("Digite o valor de C ");
		c = scanner.nextInt();
		
		System.out.println("Digite o valor de D ");
		d = scanner.nextInt();
		
		diferenca = a * b - c * d ;

		System.out.println("DIFERENÇA = " + diferenca);
		
		scanner.close();
	}

}
