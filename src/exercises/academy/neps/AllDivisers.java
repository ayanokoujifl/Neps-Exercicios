package exercises.academy.neps;

import java.util.Scanner;

public class AllDivisers {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();

		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				System.out.print(i + " ");
			}
		}
		ler.close();
	}
}
