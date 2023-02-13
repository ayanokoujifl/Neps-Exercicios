package exercises.academy.neps;

import java.util.Scanner;

public class Gangorra {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int p1 = ler.nextInt(), c1 = ler.nextInt(), p2 = ler.nextInt(), c2 = ler.nextInt();
		int t1 = p1 * c1, t2 = p2 * c2;

		if (t1 == t2) {
			System.out.println(0);
		} else if (t1 > t2) {
			System.out.println(-1);
		} else {
			System.out.println(1);
		}
	}
}
