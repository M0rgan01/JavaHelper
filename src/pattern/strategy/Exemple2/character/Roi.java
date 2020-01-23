package pattern.strategy.Exemple2.character;

import Exemple2.weapons.Hache;

public class Roi extends Personnage {

    public Roi() {
        this.arme = new Hache();
    }

    @Override
    public void combattre() {
        score+=2;
        System.out.println("Je combat comme un Roi");
        this.arme.comportementArme();
        System.out.println("Score : " + score);

    }
}
