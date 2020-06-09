package pattern.decorate;

public class SuperTechnique implements Technique {
    Technique technique;

    SuperTechnique(Technique technique){
        this.technique = technique;
    }
    @Override
    public void move() {
        technique.move();
    }
}
