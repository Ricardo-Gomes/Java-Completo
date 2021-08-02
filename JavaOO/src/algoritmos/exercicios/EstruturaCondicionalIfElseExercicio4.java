package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaCondicionalIfElseExercicio4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int horaInicial , horaFinal, duracao;
		
		System.out.println("Digite a Hora Inicial:  ");
		horaInicial = scanner.nextInt();
		
		System.out.println("Digite a Hora Final:  ");
		horaFinal = scanner.nextInt();
		
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}		
		
		System.out.println("O JOGO DUROU " + duracao + " Hrs");
	
		scanner.close();
		
	}

}
