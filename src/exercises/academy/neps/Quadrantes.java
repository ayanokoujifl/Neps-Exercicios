package exercises.academy.neps;

import java.util.Scanner;

public class Quadrantes {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Integer x = ler.nextInt(), y = ler.nextInt();

		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else {
			System.out.println("eixos");
		}

	}
}
