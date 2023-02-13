package exercises.academy.neps;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CodigoOBI2015 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		String str = "";
		int count = 0;

		for (int i = 1; i <= n; i++) {
			int x = ler.nextInt();
			str = str + x;
		}
		str = str.replace("100", "2");
		String[] res = str.split("");
		List<String> lista = Arrays.asList(res);
		for (String s : lista) {
			if (s.equals("2")) {
				count += 1;
			}
		}

		System.out.println(count);
		ler.close();
	}
}

/*
 * int x = ler.nextInt(); int y = 0;
 * 
 * for (int i = 1; i <= x; i++) { int n = ler.nextInt(); if (n == 1) { n =
 * ler.nextInt(); i++; if (i == x) { break; } if (n == 0) { n = ler.nextInt();
 * i++; if (n == 0) { y += 1; } else { i++; if (i == x) { break; } n =
 * ler.nextInt(); i++; if (i == x) { break; } if (n == 0) { n = ler.nextInt();
 * i++; if (n == 0) { y += 1; } } } } else { i++; if (i == x) { break; } n =
 * ler.nextInt(); i++; if (i == x) { break; } if (n == 0) { n = ler.nextInt();
 * i++; if (n == 0) { y += 1; } } } } } System.out.println(y);
 */