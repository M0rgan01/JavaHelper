package pattern.observer;

public class ObserverImpl2 implements Observer {

    private int counter;

    @Override
    public void update(int state) {
        // int state = ((ObservableImpl) observable).getState();
        if (state%2==0) ++ counter;
        System.out.println("---------- ObserverImpl2 -------------");
        System.out.println("Nouvelle mise à jour : " + state);
        System.out.println("Résultat : " + ((state%2) == 0 ? "Paire" : "Impaire"));
        System.out.println("Le compteur est : " + counter);
    }
}
