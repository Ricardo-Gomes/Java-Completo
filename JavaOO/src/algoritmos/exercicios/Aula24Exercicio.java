package algoritmos.exercicios;

import java.util.Locale;

public class Aula24Exercicio {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.println(product1 + " wich price is $ " + price1);
		System.out.println(product2 + " wich price is $ " + price2);
		System.out.printf("%nRecord: %d years old, code %d and gender: %c %n%n", age,code,gender);
		System.out.printf("Measue with eight decimal places : %.8f %nRounded (three decimal places): %.3f %n", measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f" , measure);

	}

}
