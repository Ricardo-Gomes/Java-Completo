package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaCondicionalIfElseExercicio2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero para ser se � PAR ou IMPAR:  ");
		numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
	
		scanner.close();
		
	}

}
