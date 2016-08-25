package br.com.adapter3;

public class Tomada implements OperacoesTomada {

	@Override
	public void ligar(PluginBrasil pluginBrasil) {
		System.out.println("Conectado tomada: " + pluginBrasil.getTipoPlugin()
		);
	}

}
