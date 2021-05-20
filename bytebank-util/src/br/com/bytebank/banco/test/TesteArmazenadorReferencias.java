package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ArmazenadorDeReferencias;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArmazenadorReferencias {

	public static void main(String[] args) {

		ArmazenadorDeReferencias armazenador = new ArmazenadorDeReferencias();
		
		Conta cc = new ContaCorrente(22,11);
		armazenador.adiciona(cc);

		Conta cc2 = new ContaCorrente(22,22);
		armazenador.adiciona(cc2);
		
		int tamanho = armazenador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) armazenador.getReferencia(1);
		System.out.println(ref.getNumero());
	}

}
