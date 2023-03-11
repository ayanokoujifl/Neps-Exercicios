package davi.condicional;

import java.util.Scanner;

public class LearnIf {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Integer idade = ler.nextInt();

		if (idade < 16) {
			System.out.println("Não vota!");
		} else if (idade < 18 || idade >= 65) {
			System.out.println("Voto opcional!");
		} else {
			System.out.println("Voto obrigatório!");
		}
		ler.close();
	}
}
