package exercises.academy.neps;

import java.util.Scanner;

public class Overflow {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int p = ler.nextInt();
		char c = ler.next().charAt(0);
		int q = ler.nextInt();
		int total = 0;
		if (c == '+') {
			total = p + q;
		} else if (c == '*') {
			total = p * q;
		}
		if (total > n) {
			System.out.println("OVERFLOW");
		} else {
			System.out.println("OK");

		}
		ler.close();
	}
}
