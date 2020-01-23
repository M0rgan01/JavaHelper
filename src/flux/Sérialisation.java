package flux;

import java.io.*;


public class Sérialisation implements Serializable{
  private String nom, style;
  private double prix;

  public Sérialisation(String nom, String style, double prix) {
    this.nom = nom;
    this.style = style;
    this.prix = prix;
  }

  public String toString(){
    return "Nom du jeu : " + this.nom + "\n Style de jeu : " + this.style + "\n Prix du jeu : " + this.prix + "\n";
  }


      public static void main(String[] args) {
        //Nous déclarons nos objets en dehors du bloc try/catch
        ObjectInputStream ois;
        ObjectOutputStream oos;
        try {
          oos = new ObjectOutputStream(
                  new BufferedOutputStream(
                    new FileOutputStream(
                      new File("game.txt"))));

          //Nous allons écrire chaque objet Game dans le fichier
          oos.writeObject(new Sérialisation("Assassin Creed", "Aventure", 45.69));
          oos.writeObject(new Sérialisation("Tomb Raider", "Plateforme", 23.45));
          oos.writeObject(new Sérialisation("Tetris", "Stratégie", 2.50));
          //Ne pas oublier de fermer le flux !
          oos.close();

          //On récupère maintenant les données !
          ois = new ObjectInputStream(
                  new BufferedInputStream(
                    new FileInputStream(
                      new File("game.txt"))));

          try {
            System.out.println("Affichage des jeux :");
            System.out.println("*************************\n");
            System.out.println(((Sérialisation)ois.readObject()).toString());
            System.out.println(((Sérialisation)ois.readObject()).toString());
            System.out.println(((Sérialisation)ois.readObject()).toString());
          } catch (ClassNotFoundException e) {
            e.printStackTrace();
          }

          ois.close();

        } catch (FileNotFoundException e) {
          e.printStackTrace();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }


