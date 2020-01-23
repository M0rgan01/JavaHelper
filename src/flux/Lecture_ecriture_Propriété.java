package flux;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Lecture_ecriture_Propriété {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		//lire un fichier config
		Properties prop = new Properties();
		try {
		    prop.load(new FileInputStream("jeu.properties"));
		    System.out.println(prop.getProperty("nom"));
		    System.out.println(prop.getProperty("Difficulte"));
		    String str = prop.getProperty("lvl");
		    System.out.println(str);

		} catch (IOException e) {
		}





		// écrire un fichier config
		Properties prop2 =new Properties();
		try {
			prop2.setProperty("niveau", "999");
		    prop2.store(new FileOutputStream("jeu2.properties"), null);
		} catch (IOException e) {

		}
	}

}
