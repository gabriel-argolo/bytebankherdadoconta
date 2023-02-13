package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;

public class GuardadorDeContas {
	private Object[] referencias;
	private int incremento;

	public GuardadorDeContas() {
		this.referencias = new Object[10];
		this.incremento = 0;
	}


	public void adicionar(Object ref) {
		referencias[this.incremento] = ref;
		incremento++;
	}
	
	public void imprimir(int pos) {
	System.out.println(referencias[pos]);	
	}


	public void tamanho() {
		// TODO Auto-generated method stub
	System.out.println(this.incremento);
	}
}
