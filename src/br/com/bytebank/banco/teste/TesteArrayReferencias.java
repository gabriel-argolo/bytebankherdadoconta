package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object [] contas = new Object[5];
		
		ContaCorrente cc1  = new ContaCorrente(123, 123);
		
		ContaPoupanca cc2 = new ContaPoupanca(321, 321);
		
		contas [0] = cc1;
		contas [1] = cc2;
		
		ContaCorrente ref = (ContaCorrente) contas[1];
		
		System.out.println(ref.getAgencia());
		System.out.println(((Conta) contas[1]).getAgencia());
	}

}
