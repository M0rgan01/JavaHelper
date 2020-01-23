package flux;

import java.io.*;

public class Sérialisation2 implements Serializable{

	private String name;
	private int age;
	private int taille;

	public Sérialisation2(String name, int age, int taille) {
		this.name = name;
		this.taille = taille;
		this.age = age;
	}

	public String toString() {
		return "Mon nom est " + this.name + " je suis agé de " + this.age + " et je mesure " + this.taille + " cm." ;

	}

	public static void main(String[] args) {
		 ObjectOutputStream création;
		 try {
			création = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("Sérialisation.ser"))));

			création.writeObject(new Sérialisation2("Morgan", 27, 180));
			création.writeObject(new Sérialisation2("emilie", 25, 170));
			création.writeObject(new Sérialisation2("sandra", 25, 186));

			création.close();

		} catch (IOException e) {
			System.err.println("Impossible de créer le fichier");
		}

	}

}
