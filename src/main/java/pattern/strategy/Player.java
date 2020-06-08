package pattern.strategy;

public class Player {

    public static void main(String[] args) {
        Context context;
        System.out.println("如果你喜欢快乐--------");
        context = new Context(new HappySpeed());
        context.operate();
        System.out.println("如果你喜欢一口闷------");
        context = new Context(new SuckBloods());
        context.operate();
        System.out.println("如果你喜欢极度猥琐----");
        context = new Context(new WretchEndure());
        context.operate();
    }
}
