package exercises.academy.neps;

import java.util.Scanner;

public class Flipper {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);

		int p, r;
		p = ler.nextInt();
		r = ler.nextInt();

		if(p==0) {
			System.out.println("C");
		}else if(p==1 && r==1) {
			System.out.println("A");
		}else {
			System.out.println("B");
		}
	}
}
