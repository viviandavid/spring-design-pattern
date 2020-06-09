package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class LolEvents extends Subject{

    private List<Subscriber> subscriberList = new ArrayList<>();

    private String message;

    @Override
    public void register(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void remove(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifyEveryOne(String message) {
        subscriberList.forEach(x->x.update(message));
    }

    public void setMessage(String message) {
        this.message = message;
        notifyEveryOne(message);
    }
}
