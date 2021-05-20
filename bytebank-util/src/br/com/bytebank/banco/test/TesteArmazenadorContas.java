package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ArmazenadorDeContas;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArmazenadorContas {

	public static void main(String[] args) {

		ArmazenadorDeContas armazenador = new ArmazenadorDeContas();
		
		Conta cc = new ContaCorrente(22,11);
		armazenador.adiciona(cc);

		Conta cc2 = new ContaCorrente(22,22);
		armazenador.adiciona(cc2);
		
		int tamanho = armazenador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = armazenador.getReferencia(1);
		System.out.println(ref.getNumero());
	}

}
