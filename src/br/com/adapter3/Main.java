package br.com.adapter3;

public class Main {

	public static void main(String[] args) {
		
		Notebook notebookBR = new Notebook("Brasileiro", TipoPlugin.DOIS_PINO);
		Notebook notebookUSA = new Notebook("Americano", TipoPlugin.TRES_PINO);
		
		Ligar tomadaAmericana = new TomadaAmericana();
		Ligar tomadaAdapter = new TomadaAdapter(tomadaAmericana);
		
		tomadaAmericana.tomada(notebookUSA);
		tomadaAdapter.tomada(notebookBR);
	}

}
