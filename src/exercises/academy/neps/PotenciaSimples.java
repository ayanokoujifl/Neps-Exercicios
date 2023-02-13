package exercises.academy.neps;

import java.util.Locale;
import java.util.Scanner;

public class PotenciaSimples {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);

		Double x = ler.nextDouble(), y = ler.nextDouble();
		
		/*
		 * Double pot = Math.pow(x, y); Locale l = new Locale("en", "US");
		 * DecimalFormatSymbols symbol= new DecimalFormatSymbols();
		 * symbol.setDecimalSeparator('.'); DecimalFormat format=new
		 * DecimalFormat("###.0000",symbol); System.out.println(format.format(pot));
		 */
		
		System.out.printf("%.4f",Math.pow(x,y));
	}
}
