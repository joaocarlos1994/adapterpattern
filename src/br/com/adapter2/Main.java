package br.com.adapter2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlugBrasil plugBrasil = new PlugBrasil();
		PlugEUA plugEUA = new PlugEUA();
		
		NotebookBrasil notebookBrasil = new NotebookBrasil();
		NotebookEUA notebookEUA = new NotebookEUA();
		
		OperacoesTomada tomadaBrasil = new TomadaBrasil(plugBrasil);
		
		tomadaBrasil.connectar(notebookBrasil);
		//tomadaBrasil.connectar(notebookEUA);
		

	}

}
