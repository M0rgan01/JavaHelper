package flux;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner_lecture_fichier {




	public static void main(String[] args) throws FileNotFoundException {


		//Lecture d'un fichier texte entier :

//		String fichier = "Test.txt";
//		File file = new File(fichier);
//
//		Scanner sc = new Scanner(file);
//
//		while (sc.hasNextLine()) {
//			String line = sc.nextLine();
//			System.out.println(line);


		//lecture d'une ligne aléatoire ou non d'un fichier

		String dico = "dictionnaire.txt";
		File file2 = new File(dico);
		Scanner sc = new Scanner(file2);

		int a = (int) (Math.random() * 336_530);


		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < a; j++) {
				sc.nextLine();
			}
			String ligne = sc.nextLine();
			System.out.println(ligne);
		}



		}


	}


