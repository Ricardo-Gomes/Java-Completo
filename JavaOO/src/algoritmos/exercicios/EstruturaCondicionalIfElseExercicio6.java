package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaCondicionalIfElseExercicio6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		double intervalo;
		
		System.out.println("Digite o n?mero: ");
		intervalo = scanner.nextDouble();

		
		if (intervalo < 0.0 || intervalo > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (intervalo <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (intervalo <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (intervalo <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}		
		else {
			System.out.println("Intervalo (75,100]");
		}
		
		scanner.close();
		
	}

}
