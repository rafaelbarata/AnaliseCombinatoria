package br.com.rafaelbarata;

public class Combinacoes {

	private int numeros[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	private static int quantidade = 6;
	private int resultado[] = new int[6];

	private int count = 0;

	private void busca(int inicio, int fim, int profundidade) {

		if ((profundidade + 1) >= quantidade)
			for (int x = inicio; x <= fim; x++) {
				resultado[profundidade] = numeros[x];
				// faz alguma coisa com um dos resultados possiveis
				count++;
				System.out.println(resultado[0] + ", " + resultado[1] + ", " + resultado[2] + ", " + resultado[3] + ", "
						+ resultado[4] + ", " + resultado[5] + "\n");
			}
		else
			for (int x = inicio; x <= fim; x++) {
				resultado[profundidade] = numeros[x];
				busca(x + 1, fim + 1, profundidade + 1);
			}
	}

	public static void main(String args[]) {

		Combinacoes comb = new Combinacoes();
		comb.busca(0, (10 - quantidade), 0);
		System.out.println("Total de combinacoes: " + comb.count);

	}

	// private void busca(int inicio, int fim, int profundidade) {
	//
	// if ((profundidade + 1) >= quantidade)
	// for (int x = inicio; x <= fim; x++) {
	// resultado[profundidade] = numeros[x];
	// // faz alguma coisa com um dos resultados possiveis
	// count++;
	// System.out.println(resultado[0] + ", " + resultado[1] + ", "
	// + resultado[2] + "\n");
	// }
	// else
	// for (int x = inicio; x <= fim; x++) {
	// resultado[profundidade] = numeros[x];
	// busca(x + 1, fim + 1, profundidade + 1);
	// }
	// }
	//
	// public static void main(String args[]) {
	//
	// Combinacoes comb = new Combinacoes();
	// comb.busca(0, (10 - 3), 0);
	// System.out.println("Total de combinacoes: " + comb.count);
	//
	// }

}