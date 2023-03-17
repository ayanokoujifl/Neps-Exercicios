package exercises.academy.neps;

import java.util.Scanner;

public class BasqueteDeRobos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int d = ler.nextInt();

		if (d <= 800) {
			System.out.println(1);
		} else if (d <= 1400) {
			System.out.println(2);
		} else if (d <= 2000) {
			System.out.println(3);
		}

		ler.close();
	}
}
