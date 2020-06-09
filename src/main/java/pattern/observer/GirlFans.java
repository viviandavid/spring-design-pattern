package pattern.observer;

public class GirlFans implements Subscriber {
    private Subject subject;
    GirlFans(Subject subject){
        this.subject = subject;
//        subject.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println("girl得到LPL赛事："+message);
    }
}
