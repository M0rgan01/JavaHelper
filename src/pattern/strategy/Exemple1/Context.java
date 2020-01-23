package pattern.strategy.Exemple1;

public class Context {

    private IStrategy strategy;

    public Context() {
        this.strategy = new StrategyImplDefault();
    }

    public void process(){
        System.out.println("Etape initiale de l'algorithme");
        strategy.applyStrategy();
        System.out.println("Etape finale de l'algorithme");
    }

    public void setiStrategy(IStrategy iStrategy) {
        this.strategy = iStrategy;
    }
}
