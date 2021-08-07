package algoritmos.exemplos;

import java.util.Scanner;

public class Aula39SintaxeSwithCase {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x;
		String dia;

		System.out.println("Digite entre 1 - 7 para ver o dia da semana");
		x = scanner.nextInt();
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Valor Inválido";
			break;
		}
	
		System.out.println("Dia da semana: " + dia);
		scanner.close();
	}

}
