package br.com.adapter3;

public abstract class Tomada {
	
	private final TipoPlugin tipoPlugin;

	public Tomada(final TipoPlugin tipoPlugin) {
		super();
		this.tipoPlugin = tipoPlugin;
	}

	public TipoPlugin getTipoPlugin() {
		return tipoPlugin;
	}
}
