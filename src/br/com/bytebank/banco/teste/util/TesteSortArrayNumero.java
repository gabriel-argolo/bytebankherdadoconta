package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteSortArrayNumero {
	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22, 33);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		class NumeroDaContaComparator implements Comparator<Conta>{
			@Override
			public int compare(Conta c1, Conta c2) {
				// TODO Auto-generated method stub
				return Integer.compare(c1.getNumero(), c2.getNumero());
			}
		}
		NumeroDaContaComparator numeroDaContaComparator = new NumeroDaContaComparator();
		lista.sort(numeroDaContaComparator);
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}
