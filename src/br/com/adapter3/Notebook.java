package br.com.adapter3;

public class Notebook {
	
	private final String tipoProduto;
	private TipoPlugin tipoPlugin;
	
	public Notebook(final String tipoProduto, final TipoPlugin tipoPlugin) {
		super();
		this.tipoProduto = tipoProduto;
		this.tipoPlugin = tipoPlugin;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public TipoPlugin getTipoPlugin() {
		return tipoPlugin;
	}

	public void setTipoPlugin(final TipoPlugin tipoPlugin) {
		this.tipoPlugin = tipoPlugin;
	}
	
	
}
