package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaCondicionalIfElseExercicio3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite um n?mero A:  ");
		a = scanner.nextInt();
		
		System.out.println("Digite um n?mero B:  ");
		b = scanner.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("S?o Multiplos");
		} else {
			System.out.println("N?o s?o Multiplos");
		}
	
		scanner.close();
		
	}

}
