package exercises.academy.neps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FitaColorida {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n = ler.nextInt();
		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			lista.add(ler.nextInt());
		}

		List<Integer> indexs = new ArrayList<>();
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) == 0) {
				indexs.add(i);
			}
		}

		Integer[] numbers = (Integer[]) lista.toArray();
		for (int i = 0; i < numbers.length; i++) {
			int dist = 0;
			if (i > 0 && i < numbers.length - 1) {

			}
		}
		ler.close();
	}
}
