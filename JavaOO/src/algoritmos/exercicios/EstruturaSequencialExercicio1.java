package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaSequencialExercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a , b, soma;
		
		System.out.println("Digite o valor de A ");
		a = scanner.nextInt();
		
		System.out.println("Digite o valor de B ");
		b = scanner.nextInt();
		soma = a + b ;

		System.out.println("SOMA = " + soma);
		
		scanner.close();
	}

}
