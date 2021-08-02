package algoritmos.exemplos;

import java.util.Scanner;

public class Aula35EstruturaCondicionalIfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas Horas? ");
		hora = scanner.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia! ");
		} else if (hora < 18){
			System.out.println("Boa tarde !");
		} else {
			System.out.println("Boa noite !");
		}
		
		scanner.close();

	}

}
