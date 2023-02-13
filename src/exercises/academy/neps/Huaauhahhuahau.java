package exercises.academy.neps;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Huaauhahhuahau {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String risada = ler.next();

		risada = risada.replaceAll("[bcdfghjklmnpqrstvwxyz]", "");
		String[] letras = risada.split("");

		String frente = "";
		String tras = "";
		for (int i = 0; i < letras.length; i++) {
			frente = frente + letras[i];
			tras = letras[i] + tras;
		}

		if (frente.equals(tras)) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}

		ler.close();
	}
}
