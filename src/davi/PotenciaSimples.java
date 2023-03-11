package davi;

import java.util.Scanner;

public class PotenciaSimples {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double x = ler.nextDouble(), y = ler.nextDouble();
		double pow = Math.pow(x, y);
		System.out.printf("%.4f",pow);
		ler.close();
	}
}
