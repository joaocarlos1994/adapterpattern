package br.com.usecabeca;

/**
 * Padrao Adaoter: Este padrao converte a interface
 * de uma classe para outra interface que o cliente
 * espera encontrar. O Apatador permite que classes
 * com interfaces incompativeis trabalhem juntas.
 * */
public class DuckTestDrive {

	public static void main(String[] args) {
		
		final MallardDuck duck = new MallardDuck();
		
		final WildTurkey turkey = new WildTurkey();
		final Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("O Peru diz...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nO Pato diz...");
		testDuck(duck);
		
		System.out.println("\nO PeruApater diz...");
		testDuck(turkeyAdapter);
	}
	
	private static void testDuck(final Duck duck) {
		duck.quack();
		duck.fly();
	}

}
