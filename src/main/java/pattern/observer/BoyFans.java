package pattern.observer;

public class BoyFans implements Subscriber{

    private Subject subject;
    BoyFans(Subject subject){
        this.subject = subject;
//        subject.register(this);
    }
    @Override
    public void update(String message) {
        System.out.println("boy得到LPL赛事："+message);
    }
}
