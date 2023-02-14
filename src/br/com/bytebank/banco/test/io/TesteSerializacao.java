package br.com.bytebank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Cliente cli = new Cliente();
		ContaCorrente cc = new ContaCorrente(123, 123);
		
		cli.setNome("Gabriel Argolo");
		cli.setCpf("123456");
		cli.setProfissao("DEV");
		
		cc.setTitular(cli);
		cc.deposita(3500.49);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
	} 
}
