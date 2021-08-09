package algoritmos.exemplos;

import java.util.Scanner;

public class Aula50EstruturaRepetitivaFor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n;
		int x;
		int soma = 0;
		
		n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			x = scanner.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		scanner.close();
	}

}
