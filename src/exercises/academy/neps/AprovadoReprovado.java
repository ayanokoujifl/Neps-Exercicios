package exercises.academy.neps;

import java.util.Scanner;

public class AprovadoReprovado {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double a = ler.nextDouble(), b = ler.nextDouble();

		double media = (a + b) / 2;
		if (media < 4) {
			System.out.println("Reprovado");
		} else if (media < 7) {
			System.out.println("Recuperacao");
		} else {
			System.out.println("Aprovado");
		}
		ler.close();
	}
}
