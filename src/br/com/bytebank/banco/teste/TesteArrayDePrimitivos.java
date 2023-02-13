package br.com.bytebank.banco.teste;

import java.util.Iterator;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idades [] = new int[5];

		//		idades [0]= 35;
		//		idades [1] = 22;
		//		idades [2] = 17;
		//		idades [3] = 96;
		//		idades [4] = 4;
		//		
		//		int idade = idades [3];
		//		
		//		System.out.println(idade);
		//		
		//		System.out.println("Tamanho do array "+idades.length);

		for (int i = 0; i < idades.length; i++) {
			idades[i] = i*i;
		}
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}

}
