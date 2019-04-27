package br.com.rafaelbarata;

import java.util.LinkedList;

public class Arranjo {

	private LinkedList<LinkedList<Integer>> result = new LinkedList<LinkedList<Integer>>();;

	private void Troca(LinkedList<Integer> v, int i, int j) {
		int t = (Integer) v.get(i);
		v.add(i, v.get(j));
		v.remove(i + 1);
		v.remove(j);
		v.add(j, t);
	}

	private void Gira_Esquerda(LinkedList<Integer> v, int go, int n) {
		int tmp = (Integer) v.get(go);
		for (int i = go; i < n; i++) {
			// v[i] = v[i + 1];
			v.remove(i);
			v.add(i, v.get(i));
		}
		v.remove(n);
		v.add(n, tmp);
	}

	private void Imprima(LinkedList<Integer> resultado) {
		int i;
		LinkedList<Integer> aux = new LinkedList<Integer>(resultado);
		result.add(aux);
		int k = resultado.size();
		System.out.print("\n");
		for (i = 0; i < k; i++)
			System.out.print(resultado.get(i) + " ");

	}

	private LinkedList<Integer> Permuta(LinkedList<Integer> v, int inicio, int n) {
		Imprima(v);
		if (inicio < n - 1) {
			int i, j;
			for (i = n - 2; i >= inicio; i--) {
				for (j = i + 1; j < n; j++) {
					Troca(v, i, j);
					Permuta(v, i + 1, n);
				}
				Gira_Esquerda(v, i, n - 1);
			}
		}
		return v;
	}

	public static void main(String args[]) {
		int i;
		int n;
		n = 4;
		System.out.println("Testando git");
		LinkedList<Integer> r = new LinkedList<Integer>();
		Arranjo arranjo = new Arranjo();
		for (i = 0; i < n; i++)
			r.add(new Integer(i));
		arranjo.Permuta((LinkedList<Integer>) r, 0, n);
	}
}