package boquita.neps;

import java.util.Locale;
import java.util.Scanner;

public class PotenciaSimples {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);
		Double x = ler.nextDouble();
		System.out.println(Math.sqrt(x));
	}
}
