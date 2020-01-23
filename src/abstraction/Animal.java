package abstraction;

public abstract class Animal {

	protected int poid;
	protected String couleur;

	protected void manger() {
		System.out.println("Je mange de la viande");
	}

	protected void boire () {
		System.out.println("je bois de l'eau");
	}

	public abstract void deplacement ();



	public abstract void crier ();

	public String toString() {
		String str = "je suis un object de la "+ this.getClass()+", je suis "+this.couleur+", et je pese "+this.poid;
		return str;
	}
}

