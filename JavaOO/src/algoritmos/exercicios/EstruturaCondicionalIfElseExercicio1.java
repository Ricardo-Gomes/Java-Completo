package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaCondicionalIfElseExercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero para ser se � Positivo ou Negativo:  ");
		numero = scanner.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("N�O NEGATIVO");
		}
	
		scanner.close();
	}

}
