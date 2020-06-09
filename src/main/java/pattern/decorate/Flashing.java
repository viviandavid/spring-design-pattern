package pattern.decorate;

public class Flashing extends SuperTechnique {
    Flashing(Technique technique) {
        super(technique);
    }

    public void flash(){
        System.out.println("F 闪现");
    }

    @Override
    public void move() {
        super.move();
        flash();
    }
}
