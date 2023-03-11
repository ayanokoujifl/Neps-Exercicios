package exercises.academy.neps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaDosElementos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n=ler.nextInt();
		List<Integer> lista = new ArrayList<>();
		for(int i=0;i<n;i++) {
			lista.add(ler.nextInt());
		}
		int soma=0;
		for(Integer i : lista) {
			soma=soma+i;
		}
		System.out.println(soma);
		ler.close();
	}
}
