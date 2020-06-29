package pattern.factory.factoryAbstract;

/**
 * @author LSD
 * @date 2020/6/29 14:43
 */
public class PackageSweetNoodle implements AbstractFactory {

    @Override
    public ColdNoodle createColdNoodles() {
        return new SweetNoodle();
    }

    @Override
    public Drink createDrink() {
        return new SweetExclusiveDrink();
    }
}
