package exercises.academy.neps;

import java.util.Scanner;

public class RepetirXVezes {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int x = ler.nextInt();
		for(int i =0;i<x;i++) {
			System.out.println("NepsAcademy eh Sucesso");
		}
		ler.close();
	}
}
