package flux;

import java.io.File;

public class Flux {


public static void main(String[] args) {



	File f = new File("Test.txt");


	System.out.println("Chemin absolut du fichier : " + f.getAbsolutePath());
	System.out.println("Nom du fichier : " + f.getName());
	System.out.println("il existe ? " + f.exists());
	System.out.println("Est-il un r�pertoir ? " + f.isDirectory());
	System.out.println("est-il un fichier ? " + f.isFile());



	  System.out.println("Affichage des lecteurs � la racine du PC : ");
	    for(File file : f.listRoots())
	    {
	      System.out.println(file.getAbsolutePath());
	      try {
	        int i = 1;
	        //On parcourt la liste des fichiers et r�pertoires
	        for(File nom : file.listFiles()){
	          //S'il s'agit d'un dossier, on ajoute un "/"
	          System.out.print("\t\t" + ((nom.isDirectory()) ? nom.getName()+"/" : nom.getName()));

	          if((i%4) == 0){
	            System.out.print("\n");
	          }
	          i++;
	        }
	        System.out.println("\n");
	      } catch (NullPointerException e) {
	        //L'instruction peut g�n�rer une NullPointerException
	        //s'il n'y a pas de sous-fichier !
	      }
	    }
	  }
}

