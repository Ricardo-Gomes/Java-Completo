package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaSequencialExercicio4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int numero, horasTrabalhadas;
		double  valorHoras, salario;
		
		System.out.println("Digite o n?mero do Funcion?rio ");
		numero = scanner.nextInt();
		
		System.out.println("Horas trabalhadas ");
		horasTrabalhadas = scanner.nextInt();
		
		System.out.println("Valor por hora trabalhada ");
		valorHoras = scanner.nextDouble();
		
		salario = valorHoras * horasTrabalhadas ;

		System.out.println("N?mero : " + numero );
		System.out.printf("Sal?rio : R$ %.2f%n" , salario );
		
		scanner.close();
	}

}
