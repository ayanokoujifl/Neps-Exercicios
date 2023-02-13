package exercises.academy.neps;

import java.util.Scanner;

public class BuscaSimples {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Integer[] arr = new Integer[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = ler.nextInt();
		}

		Integer x = ler.nextInt();

		boolean confirma = true;
		int i = 0;
		while (confirma) {
			if (arr[i] == x) {
				System.out.println("SIM");
				confirma = false;
			}
			if (i == 9) {
				if (arr[9] != x) {
					System.out.println("NAO");
					confirma = false;
				}
			}
			i++;
		}
	}
}
