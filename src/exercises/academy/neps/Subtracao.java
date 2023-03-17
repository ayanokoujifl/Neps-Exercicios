package exercises.academy.neps;

import java.util.Scanner;

public class Subtracao {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int a = ler.nextInt(), b = ler.nextInt();
		System.out.println(a - b);
		ler.close();
	}
}
