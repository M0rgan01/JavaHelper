package pattern.observer;

public interface Observable {
    // add observer
    public void subscribe(Observer o);
    // remove observer
    public void unSubscribe(Observer o);
    public void notifyObservers();
}
