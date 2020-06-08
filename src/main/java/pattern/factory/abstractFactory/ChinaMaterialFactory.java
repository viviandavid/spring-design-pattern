package pattern.factory.abstractFactory;

public class ChinaMaterialFactory implements MaterialFactory {

    @Override
    public Flour createFlour() {
        return  new ChinaFlour();
    }

    @Override
    public Flavoring createFlavoring() {
        return new ChinaFlavoring();
    }
}
