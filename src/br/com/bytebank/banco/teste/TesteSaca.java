package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Object conta = new ContaCorrente(123, 321);
		
		((ContaCorrente) conta).deposita(200.0);
		
		try {
			((ContaCorrente) conta).saca(210.0);
		} catch(SaldoInsuficienteException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		System.out.println(((Conta) conta).getSaldo());

	}

}
