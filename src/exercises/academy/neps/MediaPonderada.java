package exercises.academy.neps;

import java.util.Scanner;

public class MediaPonderada {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a = ler.nextInt(), b = ler.nextInt();
		System.out.println(((a * 4) + (b * 6)) / 10);
		ler.close();
	}
}
