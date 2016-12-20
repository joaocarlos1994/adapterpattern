package br.com.usecabeca;

/**
 * A <code>TurkeyAdapter</code> representa um adapter.
 * Em primeiro lugar, voce precisa implementar a
 * interface do tipo que esta sendo adpatado. Essa e
 * a interface que o seu cliente espera encontrar.
 * 
 * Em seguida, temos que obter uma referencia ao objeto
 * que estamos adaptando, aqui estamos fazendo isso
 * atraves do construtor.
 * 
 * */
public class TurkeyAdapter implements Duck {
	
	private final Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		super();
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for (int i = 0; i < 5; i++)
			turkey.fly();
	}

}
