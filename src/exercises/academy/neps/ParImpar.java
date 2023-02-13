package exercises.academy.neps;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int bino = ler.nextInt(), cino = ler.nextInt();
		if ((bino + cino) % 2 == 0) {
			System.out.println("Bino");
		} else {
			System.out.println("Cino");
		}

		ler.close();
	}
}
