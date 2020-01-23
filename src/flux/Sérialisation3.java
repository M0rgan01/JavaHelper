package flux;

import java.io.*;

public class Sérialisation3 {

	public static void main(String[] args) {

		ObjectInputStream chargement;


		try {

			chargement = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("Sérialisation.ser"))));

		try {


			System.out.println(((Sérialisation2)chargement.readObject()).toString());
			System.out.println(((Sérialisation2)chargement.readObject()).toString());
			System.out.println(((Sérialisation2)chargement.readObject()).toString());

		} catch (Exception e) {
			// TODO: handle exception
		}

		} catch (IOException e) {
			System.err.println("Chargement fichier impossible");
		}


	}

}
