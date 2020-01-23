package pattern.observer;

public class App {
    public static void main(String[] args) {

        ObservableImpl observable = new ObservableImpl();
        Observer o = new ObserverImpl();
        Observer o2 = new ObserverImpl2();

        observable.subscribe(o);
        observable.subscribe(o2);

        observable.setState(55);
        observable.unSubscribe(o);

        // java 7 -
        observable.subscribe(new Observer() {
            @Override
            public void update(int state) {
                System.out.println("**** Observer anonyme 1 ****");
                System.out.println(state);
            }
        });

        observable.setState(30);

        // java 8+
        observable.subscribe(obs -> {
            System.out.println("**** Observer anonyme 2 ****");
            System.out.println(obs);
        });

        observable.setState(20);
    }
}
