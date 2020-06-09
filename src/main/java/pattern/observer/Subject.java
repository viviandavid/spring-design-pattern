package pattern.observer;

public abstract class Subject {

    public abstract void register(Subscriber subscriber);

    public abstract void remove(Subscriber subscriber);

    public abstract void notifyEveryOne(String message);
}
