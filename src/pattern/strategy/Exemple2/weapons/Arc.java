package pattern.strategy.Exemple2.weapons;

public class Arc implements Arme {
    @Override
    public void comportementArme() {
        System.out.println("Je perçe avec un arc");
    }
}
