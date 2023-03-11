package davi;

import java.util.Scanner;

public class AreaTrianguloRetangulo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt(),y=ler.nextInt();
		System.out.println(x*y/2);
		ler.close();
	}
}