package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteGuardador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object cc1 = new ContaCorrente(123, 321);
		Object cc2 = new ContaCorrente(321, 123);
		Object cp = new ContaPoupanca(0, 1);
		Object ce = new ContaEspecial(5, 6);
		
		
		GuardadorDeContas g = new GuardadorDeContas();
		
		g.adicionar(cc1);
		g.adicionar(cc2);
		g.adicionar(cp);
		g.adicionar(ce);
		
		g.imprimir(1);
		g.imprimir(2);
		g.imprimir(3);
		
		System.out.println("Tamanho preenchido do array");
		g.tamanho();
		
		
	}

}
