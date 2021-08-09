package algoritmos.exemplos;

import java.util.Scanner;

public class Aula40Debug {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double largura;
		double comprimento;
		double metroQuadrado;
		double area;
		double preco;
		
		System.out.println("Digite a Largura: ");
		largura = scanner.nextDouble();
		
		System.out.println("Digite o Comprimento: ");
		comprimento = scanner.nextDouble();
		
		System.out.println("Digite o Metro Quadrado: ");
		metroQuadrado = scanner.nextDouble();
		
		area = largura * comprimento;
		preco = area * metroQuadrado;
		
		System.out.println("Area: " + area);
		System.out.println("Preço: R$ " + preco);

		scanner.close();
	}

}
