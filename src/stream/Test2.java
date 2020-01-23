package stream;

import java.util.Arrays;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {

        List<personne> listP = Arrays.asList(
                new personne(1.80, 70, "A", "Nicolas", Couleur.BLEU),
                new personne(1.56, 50, "B", "Nicole", Couleur.VERRON),
                new personne(1.75, 65, "C", "Germain", Couleur.VERT),
                new personne(1.68, 50, "D", "Michel", Couleur.ROUGE),
                new personne(1.96, 65, "E", "Cyrille", Couleur.BLEU),
                new personne(2.10, 120, "F", "Denis", Couleur.ROUGE),
                new personne(1.90, 90, "G", "Olivier", Couleur.VERRON)
        );

        var resultatYeuxBleu = listP
                .stream()
                .filter(p -> p.getYeux() == Couleur.BLEU)
                .mapToDouble(personne::getTaille)
                .average(); // moyenne

        System.out.println("Taille moyenne des yeux bleu = " + resultatYeuxBleu.getAsDouble());

        var resultatPoids = listP
                .stream()
                .mapToDouble(personne::getPoids)
                .average(); // moyenne

        System.out.println("Taille moyenne des poids = " + resultatPoids.getAsDouble());
    }
}
