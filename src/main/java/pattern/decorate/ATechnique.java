package pattern.decorate;

public class ATechnique extends SuperTechnique{

    ATechnique(Technique technique) {
        super(technique);
    }

    public void attack(){
        System.out.println("基础平A");
    }

    @Override
    public void move() {
        super.move();
        attack();
    }

}
