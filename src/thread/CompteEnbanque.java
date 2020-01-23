package thread;

public class CompteEnbanque {
 private int solde = 100;



 public int getSolde() {
	 if(this.solde < 0)
		System.out.println("vous �te � d�couvert");

	 return this.solde;

 }

 public synchronized void retraitArgent(int retrait) {
	 solde = solde - retrait;
	 System.out.println("Votre nouveau solde est de " + solde);
 }


}
