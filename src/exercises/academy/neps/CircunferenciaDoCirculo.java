package exercises.academy.neps;

import java.util.Scanner;

public class CircunferenciaDoCirculo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final double pi = 3.1416;
		Double raio = sc.nextDouble();
		System.out.printf("%.2f", pi * raio * raio);
	}
}
