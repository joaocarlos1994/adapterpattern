package br.com.adapter2;

public abstract class Notebook {
	
	private final String pais;
	private final Plug plugTomada;
	
	public Notebook(String pais, Plug plugTomada) {
		super();
		this.pais = pais;
		this.plugTomada = plugTomada;
	}

	public String getPais() {
		return pais;
	}

	public Plug getPlugTomada() {
		return plugTomada;
	}
}
