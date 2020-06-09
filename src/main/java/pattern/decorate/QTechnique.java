package pattern.decorate;

public class QTechnique extends SuperTechnique {

    QTechnique(Technique technique) {
        super(technique);
    }
    public void guns(){
        System.out.println("Q 枪炮交响曲");
    }

    @Override
    public void move() {
        super.move();
        guns();
    }
}
