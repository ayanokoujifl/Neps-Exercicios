package exercises.academy.neps;

import java.util.Scanner;

public class Codigo {
	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int count = 0;
		Integer[] numeros = new Integer[n];
		for (Integer i = 0; i < n; i++) {
			Integer x = ler.nextInt();
			numeros[i] = x;
		}

		for (int i = 0; i < numeros.length; i++) {
			if (i < numeros.length - 2) {
				if (numeros[i] == 1 && numeros[i + 1] == 0 && numeros[i + 2] == 0) {
					count++;
				}
			}
		}

		System.out.println(count);
		ler.close();

	}
}

/*
 * int n = ler.nextInt(); String str = ""; int count = 0;
 * 
 * for (int i = 1; i <= n; i++) { int x = ler.nextInt(); str = str + x; } str =
 * str.replace("100", "2"); String[] res = str.split(""); List<String> lista =
 * Arrays.asList(res); for (String s : lista) { if (s.equals("2")) { count += 1;
 * } }
 * 
 * System.out.println(count);
 */