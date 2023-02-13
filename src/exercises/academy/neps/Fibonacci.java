package exercises.academy.neps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> fibonacci = new HashMap<>();
		int n;
		int aux1 = 1, aux2 = 1;
		int fibPenult = aux2, fibUlt = aux1;
		n = sc.nextInt();
		if (n <= 2) {
			System.out.println(1);
		} else {
			fibonacci.put(1, 1);
			for (int i = 2; i <= n; i++) {
				fibonacci.put(i, fibUlt + fibPenult);
				fibUlt = fibonacci.get(i);
				int indexFibPenult = i - 1;
				fibPenult = fibonacci.get(indexFibPenult);
			}
			System.out.println(fibonacci.get(n));
			sc.close();
		}
	}
}
