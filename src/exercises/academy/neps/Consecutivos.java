package exercises.academy.neps;

import java.util.Scanner;

public class Consecutivos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n = ler.nextInt();
		int aux = 0;
		int points = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			int v = ler.nextInt();
			if (v == aux) {
				points++;
			} else {
				max = Integer.max(max, points);
				points=1;
				aux=v;
			}
		}
		max=Integer.max(max, points);
		System.out.println(max);
		ler.close();
	}
}
