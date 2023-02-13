package exercises.academy.neps;

import java.util.Scanner;

public class PositivoNegativoNulo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a = ler.nextInt();
		if (a > 0) {
			System.out.println("positivo");
		} else if (a < 0) {
			System.out.println("negativo");
		} else {
			System.out.println("nulo");
		}
		ler.close();
	}
}
