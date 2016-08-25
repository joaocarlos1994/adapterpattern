package br.com.adapter3;

public abstract class Plugin {
	
	private final TipoPlugin tipoPlugin;

	public Plugin(TipoPlugin tipoPlugin) {
		super();
		this.tipoPlugin = tipoPlugin;
	}

	public TipoPlugin getTipoPlugin() {
		return tipoPlugin;
	}
	
	

}
