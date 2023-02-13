package exercises.academy.neps;

import java.util.Scanner;

public class Xadrez {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Integer l = ler.nextInt();
		Integer c = ler.nextInt();

		if ((l + c) % 2 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		ler.close();
	}
}
