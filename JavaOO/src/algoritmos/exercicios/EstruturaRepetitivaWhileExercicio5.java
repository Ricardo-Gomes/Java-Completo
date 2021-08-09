package algoritmos.exercicios;

public class EstruturaRepetitivaWhileExercicio5 {

	public static void main(String[] args) {
		int x = 2;
		int y = 10;
		
		while (x < y) {
			System.out.println("x - " + x + " | " + "y - " + y);
			x *= 2;
			y += 1;
		}
		System.out.println("Fim");
	}
}
