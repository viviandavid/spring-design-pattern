package pattern.decorate;

public class Player {
    public static void main(String[] args) {
        JINX jinx = new JINX();
        jinx.move();

        System.out.println("-------------------");
        QTechnique qTechnique = new QTechnique(jinx);
        qTechnique.move();
//        qTechnique.guns();

        System.out.println("-------------------");
//        ETechnique eTechnique = new ETechnique(new QTechnique(jinx));
////        eTechnique.grenade();
//        eTechnique.attack();

        System.out.println("------------------");
        RTechnique rTechnique = new RTechnique(new QTechnique(new Flashing(new ETechnique(new WTechnique(new JINX())))));
        rTechnique.move();

//        System.out.println("------------------");
//        WTechnique wTechnique = new WTechnique(new ETechnique(new Flashing(new QTechnique(new RTechnique(jinx)))));
//        wTechnique.move();

        System.out.println("------------------");
        RTechnique rTechnique2 = new RTechnique(new QTechnique(new QTechnique(new Flashing(new ATechnique(
                new ATechnique(new ETechnique(new WTechnique(new JINX()))))))));
        rTechnique2.move();
    }
}
