package br.com.adapter;

public class SMS {
	
	private final String destino;
	private final String origem;
	private final String texto;
	
	public SMS(String destino, String origem, String texto) {
		super();
		this.destino = destino;
		this.origem = origem;
		this.texto = texto;
	}

	public String getDestino() {
		return destino;
	}

	public String getOrigem() {
		return origem;
	}

	public String getTexto() {
		return texto;
	}
	
	

}
