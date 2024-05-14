package view;

import controller.FazHash;
import model.Numero;

public class Main {

	public static void main(String[] args) {
		Numero n1 = new Numero();
		Numero n2 = new Numero();
		Numero n3 = new Numero();
		Numero n4 = new Numero();
		Numero n5 = new Numero();

		FazHash fazHash = new FazHash();
		fazHash.adicionarNum(n1);
		fazHash.adicionarNum(n2);
		fazHash.adicionarNum(n3);
		fazHash.adicionarNum(n4);
		fazHash.adicionarNum(n5);
	}

}