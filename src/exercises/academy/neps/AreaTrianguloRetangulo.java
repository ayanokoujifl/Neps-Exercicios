package exercises.academy.neps;

import java.util.Scanner;

public class AreaTrianguloRetangulo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a = ler.nextInt(), b = ler.nextInt();
		System.out.println((a * b) / 2);
		ler.close();
	}
}
