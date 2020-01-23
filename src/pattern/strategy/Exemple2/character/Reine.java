package pattern.strategy.Exemple2.character;

import Exemple2.weapons.Arc;
import Exemple2.weapons.Hache;

public class Reine extends Personnage {

    public Reine() {
        this.arme = new Arc();
    }

    @Override
    public void combattre() {
        score+=4;
        System.out.println("Je combat comme une Reine");
        this.arme.comportementArme();
        System.out.println("Score : " + score);
        if (score>=4) {
            this.setArme(new Hache());
        }
    }
}
