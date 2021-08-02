package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaCondicionalIfElseExercicio5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int escolha, qtd ;
		double total;
		
		System.out.println("Código - 1 | Especificação - Cachorro Quente | Preço - R$ 4,00 ");
		System.out.println("Código - 2 | Especificação - X-Salada        | Preço - R$ 4,50 ");
		System.out.println("Código - 3 | Especificação - X-Bacon         | Preço - R$ 5,00 ");
		System.out.println("Código - 4 | Especificação - Torrada Simples | Preço - R$ 2,00 ");
		System.out.println("Código - 5 | Especificação - Refrigerante    | Preço - R$ 1,50 ");

		
		System.out.println("Escolha a sua primeira opção: ");
		escolha = scanner.nextInt();

		System.out.println("Escolha a quantidade: ");
		qtd = scanner.nextInt();
		
		if (escolha == 1) {
			total = qtd * 4;
			System.out.println("Valor a pagar: R$" + total);
		} else if (escolha == 2) {
			total = qtd * 4.5;
			System.out.println("Valor a pagar: R$" + total);
		} else if (escolha == 3) {
			total = qtd * 5;
			System.out.println("Valor a pagar: R$" + total);
		} else if  (escolha == 4) {
			total = qtd * 2;
			System.out.println("Valor a pagar: R$" + total);
		} else {
			total = qtd * 1.5;
			System.out.println("Valor a pagar: R$" + total);
		}

		scanner.close();
		
	}

}
