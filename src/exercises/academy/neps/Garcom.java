package exercises.academy.neps;

import java.util.Scanner;

public class Garcom {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n = ler.nextInt();
		int soma = 0;
		for (int i = 1; i <= n; i++) {
			int l = ler.nextInt();
			int c = ler.nextInt();
			if (l > c) {
				soma += c;
			}
		}
		System.out.println(soma);
	}
}
