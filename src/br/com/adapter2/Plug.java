package br.com.adapter2;

public abstract class Plug {
	
	private final TiposPlugTomada plug;

	public Plug(TiposPlugTomada plug) {
		super();
		this.plug = plug;
	}

	public TiposPlugTomada getPlug() {
		return plug;
	}
	
	

}
