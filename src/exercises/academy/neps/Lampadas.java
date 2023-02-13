package exercises.academy.neps;

import java.util.Scanner;

public class Lampadas {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n = ler.nextInt();
		int i1 = 0, i2 = 0;
		int x;
		for (int i = 1; i <= n; i++) {
			x = ler.nextInt();
			if (x == 1) {
				if (i1 == 0) {
					i1 = 1;
				} else {
					i1 = 0;
				}
			} else if (x == 2) {
				if (i1 == 0 && i2 == 0) {
					i1 = 1;
					i2 = 1;
				} else if (i1 == 0 && i2 == 1) {
					i1 = 1;
					i2 = 0;
				} else if (i1 == 1 && i2 == 0) {
					i1 = 0;
					i2 = 1;
				} else if (i1 == 1 && i2 == 1) {
					i1 = 0;
					i2 = 0;
				}
			}
		}
		System.out.println(i1);
		System.out.println(i2);
	}
}
