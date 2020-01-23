package collection;

public class Personne {


	private double poid, taille;
	private int age;
	private String nom;


	public Personne(String nom, int age, double poid, double taille) {
		this.nom = nom;
		this.age = age;
		this.poid = poid;
		this.taille = taille;
	}

	public String toString() {
		String str = "Je m'appele " + nom + ", j'ai  " + age + " ans, je pèse " + poid + " kilos, et je mesure " + taille + " cm";
		return str;
	}

	public double getPoid() {
		return poid;
	}

	public void setPoid(double poid) {
		this.poid = poid;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


}
