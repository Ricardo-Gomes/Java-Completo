package algoritmos.exemplos;

public class Aula40CondicionalTernaria {

	public static void main(String[] args) {
		
		double preco = 34.5, desconto;
		
//		if (preco < 20.0) {
//			desconto = preco * 0.1;
//		} else {
//			desconto = preco * 0.05;
//		}
//
//		System.out.println(desconto);
		
		desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);

		
	}
}
