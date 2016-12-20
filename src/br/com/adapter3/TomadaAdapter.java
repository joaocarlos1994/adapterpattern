package br.com.adapter3;

public class TomadaAdapter implements Ligar {
	
	private final Ligar ligar;

	public TomadaAdapter(final Ligar ligar) {
		super();
		this.ligar = ligar;
	}

	@Override
	public void tomada(final Notebook notebook) {
		notebook.setTipoPlugin(TipoPlugin.TRES_PINO);
		ligar.tomada(notebook);
	}
	
}
