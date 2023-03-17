package exercises.academy.neps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuadradoMagico {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n = ler.nextInt();

		int[][] quadrado = new int[n][n];
		int[] somaLinhas = new int[n];
		int[] somaColunas = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				quadrado[i][j] = ler.nextInt();
			}
		}
		List<Integer> listaLinhas = new ArrayList<>();
		List<Integer> listaColunas = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				somaLinhas[i] = somaLinhas[i] + quadrado[i][j];
				somaColunas[i] = somaColunas[i] + quadrado[j][i];
			}
			listaLinhas.add(somaLinhas[i]);
			listaColunas.add(somaColunas[i]);
		}

		if (listaColunas.contains(0) || listaLinhas.contains(0)) {

		}

		if (listaColunas.equals(listaLinhas)) {
			System.out.println(listaLinhas.get(0));
		} else {
			System.out.println("-1");
		}
		ler.close();
	}
}