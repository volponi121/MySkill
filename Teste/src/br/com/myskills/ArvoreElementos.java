package br.com.myskills;

public class ArvoreElementos {
	private TipoNo arvoreTree;

	public TipoNo getARVORE() {
		return arvoreTree;
	}

	public void setARVORE(TipoNo arvore) {
		arvoreTree = arvore;
	}

	protected void colocarValores(TipoNo no, String v1, String v2) {
		String aux = no.valor;
		no.valor = v1;
		no.sim = new TipoNo(v2, ++Perguntas.contador);
		no.nao = new TipoNo(aux, ++Perguntas.contador);
	}
}
