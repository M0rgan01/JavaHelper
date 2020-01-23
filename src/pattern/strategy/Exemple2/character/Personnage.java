package pattern.strategy.Exemple2.character;

import Exemple2.weapons.Arme;

public abstract class Personnage {

    protected int score;
    protected Arme arme;


    public abstract void combattre();

    public void setArme(Arme arme) {
        this.arme = arme;
    }
}
