package br.com.adapter2;

public class TomadaBrasil implements OperacoesTomada {
	
	private final PlugBrasil plugBrasil;
	
	public TomadaBrasil(PlugBrasil plugBrasil) {
		super();
		this.plugBrasil = plugBrasil;
	}


	@Override
	public void connectar(Notebook notebook) {
		if(notebook.getPlugTomada().getPlug() == plugBrasil.getPlug()){
			System.out.println("Connectado");
		} else {
			throw new IllegalArgumentException("Formado do Plug inválido");
		}
	}

}
