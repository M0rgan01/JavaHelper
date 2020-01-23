package pattern.strategy.Exemple2.weapons;

public class Hache implements Arme {
    @Override
    public void comportementArme() {
        System.out.println("Je tranche avec un hache");
    }
}
