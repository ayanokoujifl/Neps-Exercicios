package exercises.academy.neps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenacaoSimples {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n = ler.nextInt();

		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			numbers.add(ler.nextInt());
		}
		Collections.sort(numbers);
		numbers.stream().forEach(number -> System.out.print(number + " "));
		ler.close();
	}
}
