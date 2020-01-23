package genericite;

public class Test {

	public static void main(String[] args) {

		Toto <String> val1 = new Toto <String> ("bonjour");
		Toto <Integer> val2 = new Toto <Integer> (12);
		Toto <Double> val3 = new Toto <Double> (12.124);
		Toto <Float> val4 = new Toto <Float> (33.25f);
		Toto <Character> val5 = new Toto <Character> ('m');

		System.out.println(val1.getValeur());
		System.out.println(val2.getValeur());
		System.out.println(val3.getValeur());
		System.out.println(val4.getValeur());
		System.out.println(val5.getValeur());
		val2.setValeur(15);
		System.out.println(val2.getValeur());


		Duo <String, Boolean> dual = new Duo <String, Boolean> ("toto", true);
		  System.out.println("Valeur de l'objet dual : val1 = " + dual.getValeur1() + ", val2 = " + dual.getValeur2());

		Duo <Double, Character> dual2 = new Duo <Double, Character> (12.2585, 'C');
		  System.out.println("Valeur de l'objet dual2 : val1 = " + dual2.getValeur1() + ", val2 = " + dual2.getValeur2());
	}

}
