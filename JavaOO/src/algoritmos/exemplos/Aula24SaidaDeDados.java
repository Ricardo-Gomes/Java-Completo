package algoritmos.exemplos;

import java.util.Locale;

public class Aula24SaidaDeDados {

	public static void main(String[] args) {
		
		double x = 10.35784;

		double renda = 4000.0;
		String nome = "Maria";
		int idade = 31;
		
		System.out.println(x);
		
		//mascara para delimitar separador de decimais com o idioma local
		System.out.printf("%.2f%n", x);
		
		//mascara para delimitar separador de decimais com outro idioma
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		
		//%f - ponto flutuante, %d - inteiro, %s - texto, %n - quebra de linha
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
