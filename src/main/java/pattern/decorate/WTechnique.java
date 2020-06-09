package pattern.decorate;

public class WTechnique extends SuperTechnique{

    WTechnique(Technique technique) {
        super(technique);
    }
    public void electron(){
        System.out.println("W 震荡电磁波");
    }

    @Override
    public void move() {
        super.move();
        electron();
    }
}
