package abstraction;

public class Test {

	public static void main(String[] args) {

		//Animal c = new chien marche
		Chien c = new Chien("maron",30);

		c.boire();
		c.crier();
		c.deplacement();
		System.out.println(c.toString());

		System.out.println("------------------------------------------");
		//Animal c = new chien ne marche plus

		c.faireCalin();
		c.faireLebeau();
		c.faireLechouille();

		Rintintin R = new Chien();
		R.faireCalin();
		R.faireLechouille();
		R.faireLebeau();



	}

}
