package br.com.adapter3;

public class TomadaAmericana extends Tomada implements Ligar {

	public TomadaAmericana() {
		super(TipoPlugin.TRES_PINO);
	}

	@Override
	public void tomada(final Notebook notebook) {
		if (notebook.getTipoPlugin() == getTipoPlugin()) {
			System.out.println("Tomada Americana: Ligando notebook o tipo " + notebook.getTipoProduto());
		} else {
			throw new RuntimeException("Nao e possivel conectar");
		}
	}


	
	

}
