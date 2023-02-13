package exercises.academy.neps;

import java.util.Scanner;

public class JogoDoMilhao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n = ler.nextInt();
		int a;
		int soma = 0;
		int dias = 0;
		for (int i = 1; i <= n; i++) {
			a = ler.nextInt();
			soma += a;
			if (soma >= 1000000) {
				dias = i;
				break;
			}
		}
		if (dias < n) {
			for (int i = dias; i < n; i++) {
				a = ler.nextInt();
			}
		}
		System.out.println(dias);
	}
}
