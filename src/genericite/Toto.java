package genericite;

public class Toto<T> {

	private T valeur;

	public Toto() {
	this.valeur=null;
	}

	public Toto(T val) {
	this.valeur = val;
	}

	public void setValeur(T val) {
	this.valeur = val;
	}




	public T getValeur() {
	return this.valeur;

	}

}
