package model;

import java.util.Objects;

public class Numero {
	private int numero;

	public Numero() {
		this.numero = (int) (Math.random() * 100) + 1;
	}

	public int hashCode(int tamanho) {
		final long A = 2654435769L;
		long hash = numero * tamanho * A;
		hash ^= (hash >> 20) ^ (hash >> 12);
		hash ^= (hash >> 7) ^ (hash >> 4);
		int posicao = (int) (hash % tamanho);
		if (posicao < 0) {
			posicao += tamanho;
		}
		return posicao;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Numero other = (Numero) obj;
		return numero == other.numero;
	}

}
