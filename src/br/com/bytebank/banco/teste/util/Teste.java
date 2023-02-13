package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Iterator;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {
	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		Conta cc = new ContaCorrente(123, 321);
		Conta cp = new ContaPoupanca(321,123);
		lista.add(cp);
		lista.add(cc);
		
		System.out.println("Tamanho do Array" +lista.size());
		
		Object ref = lista;
		
		for (Object oRef : lista) {
			System.out.println(oRef);
		}
		System.out.println("----------------------------");
		lista.remove(1);
		for (Object obj : lista) {
			System.out.println(obj);
		}
		
	}
}
