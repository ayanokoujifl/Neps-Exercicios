package algoritmo.luana;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		List<String> nomes = new ArrayList<>();
		List<Double> salarios = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Qual o nome do(a) " + i + "º empregado(a)?");
			nomes.add(ler.next());
			System.out.println("Qual o salário do(a) " + i + "º empregado(a)");
			Double salario = ler.nextDouble();
			Double comissao = 0.0;
			if (salario <= 1000) {
				comissao = 0.15;
			} else if (salario <= 2000) {
				comissao = 0.10;
			} else {
				comissao = 0.07;
			}
			Double salarioFinal = salario + (salario * comissao);
			salarios.add(salarioFinal);
		}
		for (Double salario : salarios) {
			System.out.println(nomes.get(salarios.indexOf(salario)) + " - " + salario);
		}
		Double soma = salarios.stream().mapToDouble(Double::doubleValue).sum();
		System.out.println("Média salarial: " + soma / 5);
		System.out.println("Menor salario: " + salarios.stream().mapToDouble(Double::doubleValue).min().getAsDouble());
		ler.close();
	}
}
