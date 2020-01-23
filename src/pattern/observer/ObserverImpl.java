package pattern.observer;

public class ObserverImpl implements Observer {



    @Override
    public void update(int state) {
        // int state = ((ObservableImpl) observable).getState();
        double res = state*state + 9;
        System.out.println("---------- ObserverImpl -------------");
        System.out.println("Nouvelle mise à jour : " + state);
        System.out.println("Résultat : " + res);
    }
}
