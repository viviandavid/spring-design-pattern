package pattern.decorate;

public class ETechnique extends SuperTechnique{

    ETechnique(Technique technique) {
        super(technique);
    }

    public void grenade(){
        System.out.println("E 嚼火者手雷");
    }

    @Override
    public void move() {
        super.move();
        grenade();

    }
}
