package genericite;

public class Duo<T, S> {
	  //Variable d'instance de type T
	  private T valeur1;

	  //Variable d'instance de type S
	  private S valeur2;

	  //Constructeur par d�faut
	  public Duo(){
	    this.valeur1 = null;
	    this.valeur2 = null;
	  }

	  //Constructeur avec param�tres
	  public Duo(T val1, S val2){
	    this.valeur1 = val1;
	    this.valeur2 = val2;
	  }

	  //M�thodes d'initialisation des deux valeurs
	  public void setValeur(T val1, S val2){
	    this.valeur1 = val1;
	    this.valeur2 = val2;
	  }

	  //Retourne la valeur T
	  public T getValeur1() {
	    return valeur1;
	  }

	  //D�finit la valeur T
	  public void setValeur1(T valeur1) {
	    this.valeur1 = valeur1;
	  }

	  //Retourne la valeur S
	  public S getValeur2() {
	    return valeur2;
	  }

	  //D�finit la valeur S
	  public void setValeur2(S valeur2) {
	    this.valeur2 = valeur2;
	  }
	}
