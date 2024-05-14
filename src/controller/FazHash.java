package controller;

import br.edu.fateczl.lista.listaObj.Lista;
import model.Numero;

public class FazHash {
	Lista[] Hash;

	public FazHash() {
		int n = (int) (Math.random() * 100) + 1;
		System.out.println("Tamanho do vetor: " + n);
		Hash = new Lista[n];
		inicializarHash();
	}

	private void inicializarHash() {
		int tamanho = Hash.length;
		for (int i = 0; i < tamanho; i++) {
			Hash[i] = new Lista();
		}
	}

	public void adicionarNum(Numero num) {
		int posicao = num.hashCode(Hash.length);
		System.out.println("N: " + num.getNumero() + " | Hash: " + posicao);

		Hash[posicao].addFirst(num.getNumero());
	}
}
