package davi.repeticao;

public class LearnRepeats {
	public static void main(String[] args) {

		/*
		 * for(iterador; repita até ; faça a cada loop){ }
		 */

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		Integer i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		Integer n = 1;
		do {
			System.out.println(n);
			n++;
		} while (n <= 10);
	}
}
