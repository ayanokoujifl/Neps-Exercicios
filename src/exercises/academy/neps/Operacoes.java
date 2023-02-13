package exercises.academy.neps;

import java.util.Scanner;

public class Operacoes {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		char operador = ler.next().charAt(0);
		double a=ler.nextDouble(),b=ler.nextDouble();
		
		if(operador=='M') {
			System.out.printf("%.2f",a*b);
		}else {
			System.out.printf("%.2f",a/b);
		}
		
		ler.close();
	}
}
