package algoritmos.exemplos;

import java.util.Scanner;

public class Aula41EstruturaRepetetivaWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x, soma = 0;

		System.out.println("Digite um valor: ");
		x = scanner.nextInt();
		
		while (x != 0) {
			soma += x;
			x = scanner.nextInt();
		}
		
		System.out.println(soma);
		scanner.close();
	}

}
