package br.com.bytebank.banco.modelo;

public class ArmazenadorDeReferencias {

	private Object[] referencias;
	private int posicaoOcupada;
	
	public ArmazenadorDeReferencias() {
		this.referencias = new Object[10];
		this.posicaoOcupada = 0;
	}
	
	public void adiciona(Object ref) {
		this.referencias[this.posicaoOcupada] = ref;
		this.posicaoOcupada++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoOcupada;
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}
}
