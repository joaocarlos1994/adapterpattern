package br.com.adapter2;


public class TomadaEUA implements OperacoesTomada {
	
	private final PlugEUA plugEUA;

	public TomadaEUA(PlugEUA plugEUA) {
		super();
		this.plugEUA = plugEUA;
	}



	@Override
	public void connectar(Notebook notebook) {
		if (notebook.getPlugTomada().getPlug() == plugEUA.getPlug()) {
			System.out.print("Connectado pluga 3");
		}
	}

}
