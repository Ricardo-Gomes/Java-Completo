package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaSequencialExercicio6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;		

		System.out.println("Digite o valor de A: ");
		A = scanner.nextDouble();		

		System.out.println("Digite o valor de B: ");
		B = scanner.nextDouble();		

		System.out.println("Digite o valor de C: ");
		C = scanner.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;

		System.out.println("TRIANGULO: " + triangulo);
		System.out.println("CIRCULO: " + circulo);
		System.out.println("TRAPEZIO: " + trapezio);
		System.out.println("QUADRADO: " + quadrado);
		System.out.println("RETANGULO: " + retangulo);

		scanner.close();
	}

}
