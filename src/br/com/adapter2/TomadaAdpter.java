package br.com.adapter2;

public class TomadaAdpter implements OperacoesTomada {
	
	private final TomadaEUA tomadaEUA;

	public TomadaAdpter(TomadaEUA tomadaEUA) {
		super();
		this.tomadaEUA = tomadaEUA;
	}


	@Override
	public void connectar(Notebook notebook) {
		tomadaEUA.connectar(notebook);
	}

}
