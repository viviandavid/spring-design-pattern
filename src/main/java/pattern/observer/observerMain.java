package pattern.observer;

public class observerMain {

    public static void main(String[] args) {
        LolEvents lolEvents = new LolEvents();
        BoyFans boyFans = new BoyFans(lolEvents);
        GirlFans girlFans = new GirlFans(lolEvents);
        lolEvents.register(boyFans);
        lolEvents.register(girlFans);
        lolEvents.setMessage("猪狗大战！！");
        lolEvents.remove(girlFans);
        lolEvents.setMessage("LGD NB");
    }
}
