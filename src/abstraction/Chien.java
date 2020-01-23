package abstraction;

public class Chien extends Canin implements Rintintin {


	public Chien() {
	}

	public Chien(String couleur, int poid) {
		this.couleur = couleur;
		this.poid = poid;


	}
	public void crier() {
		System.out.println("j'aboie sans raison");


	}


	public void faireLebeau() {

		System.out.println("je fais le beau");
	}


	public void faireCalin() {

		System.out.println("je fais un gros calin");
	}


	public void faireLechouille() {

		System.out.println("je fais des lechouilles");
	}


	}


