package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaCondicionalIfElseExercicio8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		double salario, imposto;
		
		System.out.println("Renda - de R$ 0,00 a R$ 2000,00     | Imposto de Renda - ISENTO ");
		System.out.println("Renda - de R$ 2000,01 a R$ 3000,00  | Imposto de Renda - 8% ");
		System.out.println("Renda - de R$ 3000,01 a R$ 4500,00  | Imposto de Renda - 18% ");
		System.out.println("Renda - acima de R$ 4500,00         | Imposto de Renda - 28% ");

		System.out.println("Digite o seu Salário : R$  ");
		salario = scanner.nextDouble();
		
		if (salario <= 2000.0) {
			imposto = 0.0;
		} else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		} else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if (imposto == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		scanner.close();
	}

}
