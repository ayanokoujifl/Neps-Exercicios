package exercises.academy.neps;

import java.util.Scanner;

public class Medalhas {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Integer t1, t2, t3;
		t1 = ler.nextInt();
		t2 = ler.nextInt();
		t3 = ler.nextInt();

		if (t1 <= t2 && t1 <= t3) {
			System.out.println(1);
			if (t2 <= t3) {
				System.out.println(2);
				System.out.println(3);
			} else {
				System.out.println(3);
				System.out.println(2);
			}
		} else if (t2 <= t1 && t2 <= t3) {
			System.out.println(2);
			if (t1 <= t3) {
				System.out.println(1);
				System.out.println(3);
			} else {
				System.out.println(3);
				System.out.println(1);
			}
		} else {
			System.out.println(3);
			if (t1 <= t2) {
				System.out.println(1);
				System.out.println(2);
			} else {
				System.out.println(2);
				System.out.println(1);
			}
		}
	}
}
