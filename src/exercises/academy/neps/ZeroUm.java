package exercises.academy.neps;

import java.util.Scanner;

public class ZeroUm {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a = ler.nextInt(), b = ler.nextInt(), c = ler.nextInt();
		if (a == b && a == c) {
			System.out.println("*");
		} else if (a == b && a != c) {
			System.out.println("C");
		} else if (a == c && a != b) {
			System.out.println("B");
		} else if (b == c && b != a) {
			System.out.println("A");
		}
		ler.close();
	}
}
