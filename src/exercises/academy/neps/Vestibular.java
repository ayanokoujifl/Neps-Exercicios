package exercises.academy.neps;

import java.util.Scanner;

public class Vestibular {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int acertos = 0;
		int numeroQuestoes = ler.nextInt();
		String gabarito = ler.next();
		String respostas = ler.next();

		String[] arrGabarito = gabarito.split("");
		String[] arrRespostas = respostas.split("");

		for(int i=0;i<numeroQuestoes;i++) {
			if(arrGabarito[i].equals(arrRespostas[i])) {
				acertos++;
			}
		}
		System.out.println(acertos);
		ler.close();
	}
}
