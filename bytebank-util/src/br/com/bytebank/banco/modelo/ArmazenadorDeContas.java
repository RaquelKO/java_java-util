package br.com.bytebank.banco.modelo;

public class ArmazenadorDeContas {

	private Conta[] referencias;
	private int posicaoOcupada;
	
	public ArmazenadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoOcupada = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencias[this.posicaoOcupada] = ref;
		this.posicaoOcupada++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoOcupada;
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}
}
