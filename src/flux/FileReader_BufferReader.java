package flux;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_BufferReader {

	public static void main(String[] args) throws IOException {
		//FileReader et BufferReader sont des autres moyen de lecture

		File file = new File("Test.txt");

		//FileReader permet de lire les ligne caractère par caractère
		FileReader fr = new FileReader(file);

		//nous pouvons aussi directement mettre le fichier en argument sans passer par File :
		//FileReader fr = new FileReader("Test.txt");


		//Et BufferReader lui permet de lire ligne par ligne un fichier
		BufferedReader br = new BufferedReader(fr);

		String ligne;

		//nous stokons ligne au niveaux de la méthode readline qui lis les lignes, et tant qu'une ligne n'est pas égal à null(, nous continuons la boucle
		while((ligne = br.readLine()) != null) {
		System.out.println(ligne);
		}


br.close();
	}
}
