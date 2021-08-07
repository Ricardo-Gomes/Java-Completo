package algoritmos.exemplos;

import java.util.Scanner;

public class Aula39SintaxeIfElse {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x;
		String dia;

		System.out.println("Digite entre 1 - 7 para ver o dia da semana");
		x = scanner.nextInt();
		
		if (x == 1) {
			dia = "Domingo";
		} else if (x == 2) {
			dia = "Segunda";
		} else if (x == 3) {
			dia = "Terça";
		} else if (x == 4) {
			dia = "Quarta";
		} else if (x == 5) {
			dia = "Quinta";
		} else if (x == 6) {
			dia = "Sexta";
		} else if (x == 7) {
			dia = "Sabado";
		} else {
			dia = "Valor Inválido";
		}
	
		System.out.println("Dia da semana: " + dia);
		scanner.close();
	}

}
