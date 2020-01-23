package pattern.strategy.Exemple1;

public class StrategyImplDefault implements IStrategy{
    @Override
    public void applyStrategy() {
        System.out.println("Etape intermédiaire de l'algorithme par défault");
    }
}
