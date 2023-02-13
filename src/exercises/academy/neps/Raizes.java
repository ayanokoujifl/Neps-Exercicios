package exercises.academy.neps;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Raizes {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);

		int n = ler.nextInt();
		Locale l = new Locale("en", "US");
		DecimalFormatSymbols symbol= new DecimalFormatSymbols();
		symbol.setDecimalSeparator('.');
		DecimalFormat format=new DecimalFormat("########0.0000",symbol);
		List<Double> raizes = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			Double x = ler.nextDouble();
			raizes.add(Math.sqrt(x));
		}
		raizes.stream().forEach(x->System.out.println(format.format(x)));
		ler.close();
	}
}
