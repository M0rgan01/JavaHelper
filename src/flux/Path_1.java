package flux;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Path_1 {

	public static void main(String[] args) throws IOException {


		Path path = Paths.get("Test.txt");

		System.out.println("Chemin absolu du fichier : " + path.toAbsolutePath());
		System.out.println("Est-ce qu'il existe ? " + Files.exists(path));
		System.out.println("Nom du fichier : " + path.getFileName());
		System.out.println("Est-ce un répertoire ? " + Files.isDirectory(path));


		//Copie de fichier :

		//fichier existant
		//Path source = Paths.get("Test.txt");

		//fichier créer, non existant
		//Path destination = Paths.get("Test_copy.txt");

		//commande de copie, argument 1 le dossier à copier, argument 2 le fichier à destination, et le 3 l'option, qui la permet de remplacer le fichier s'il existe déja
		//Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);

		//commende de suppression, en argument le fichier a suprimé
		//Files.delete(arg);


		//création de dossier :

		Path dossier = Paths.get("Mon dossier");

		//Si le dossier existe déja, il peut y avoir exception, nous le placons donc dans un bloc if/else

		if(! Files.exists(dossier))
		Files.createDirectories(dossier);
		else System.out.println("le dossier existe déja");

		//déplacement de fichier :

		//Path source2 = Paths.get("Dictionnaire.txt");
		//Path destination2 = Paths.get("Mon dossier");

		//Commande de déplacement, argument 1 le dossier à déplacer, en 2 la distination avec une option resolve qui renome l'argument 1, et en 3 l'option

		//Files.move(source2, destination2.resolve("Dico.txt"), StandardCopyOption.REPLACE_EXISTING);


		//Lire un fichier

		Path lecture = Paths.get("Test.txt");

		// la commande read-all-lines prends un path comme 1er argument et doit être placé dans une list
		// le 2eme argument, iso-8859-1 est un encodage nécéssaire pour lire les mots avec accent, Standarcharset marche aussi
		//List<String> listLecture = Files.readAllLines(lecture,Charset.forName("ISO-8859-1"));
		//Utf-8 à été mis par défault, plus besoin d'y revenir


		List<String> listLecture = Files.readAllLines(lecture);
		for (String boucle : listLecture) {
			System.out.println(boucle);
		}

		//écrire sur un fichier

		Path ecriture = Paths.get("Test_copyy.txt");

		String texte = "Bonjour tout le monde \nBonjour\n";

		//Pour écrire et suprimé l'ancien contenu
		//Files.write(ecriture, texte.getBytes());

		//Pour écrire sans suprimé l'ancien contenu
		Files.write(ecriture, texte.getBytes(),
				//option pour créer le fichier s'il n'existe pas
				StandardOpenOption.CREATE,
				//ouvre le fichier en écriture
				StandardOpenOption.WRITE,
				//ajoute le contenu à la suite de l'ancien
				StandardOpenOption.APPEND);

	}

}
