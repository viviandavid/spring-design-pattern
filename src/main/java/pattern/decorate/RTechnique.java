package pattern.decorate;

public class RTechnique extends SuperTechnique{
    RTechnique(Technique technique) {
        super(technique);
    }
    public void missile(){
        System.out.println("R 超究极死神飞弹");
    }

    @Override
    public void move() {
        super.move();
        missile();
    }
}
