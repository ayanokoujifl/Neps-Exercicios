package exercises.academy.neps;

import java.util.Scanner;

public class Bondinho {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, m;
		a = ler.nextInt();
		m = ler.nextInt();

		if (a + m > 50) {
			System.out.println("N");
		} else {
			System.out.println("S");
		}
		ler.close();
	}
}
