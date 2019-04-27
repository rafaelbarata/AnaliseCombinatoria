package br.com.rafaelbarata;

import java.util.Arrays;
import java.util.List;

public class Combinacoes {

	private Integer numeros[] = { 1, 2, 3, 4, 5, 6, 7 };
	private static int quantidade = 6;
	private int resultado[] = new int[quantidade];

	private int count = 0;
	private List<Integer> listaDeNumeros;

	private void busca(int inicio, int fim, int profundidade) {

		if ((profundidade + 1) >= quantidade) {
			for (int x = inicio; x <= fim; x++) {
				resultado[profundidade] = numeros[x];
				// faz alguma coisa com um dos resultados possiveis
				count++;

				for (int i = 0; i < quantidade; i++) {
					System.out.print(resultado[i] + (i < quantidade - 1 ? ", " : "\n"));
				}
			}
		} else
			for (int x = inicio; x <= fim; x++) {
				resultado[profundidade] = numeros[x];
				busca(x + 1, fim + 1, profundidade + 1);
			}
	}

	public static void main(String args[]) {

		Combinacoes comb = new Combinacoes();
		comb.listaDeNumeros = Arrays.asList(comb.numeros);
		comb.busca(0, (comb.listaDeNumeros.size() - quantidade), 0);
		System.out.println("Total de combinacoes: " + comb.count);

	}
}