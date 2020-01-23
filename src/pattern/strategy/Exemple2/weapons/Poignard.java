package pattern.strategy.Exemple2.weapons;

public class Poignard implements Arme {
    @Override
    public void comportementArme() {
        System.out.println("Je poignarde");
    }
}
