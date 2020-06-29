package pattern.factory.factoryAbstract;

/**
 * @author LSD
 * @date 2020/6/29 14:43
 */
public class PackageHotNoodle implements AbstractFactory {

    @Override
    public ColdNoodle createColdNoodles() {
        return new HotNoodle();
    }

    @Override
    public Drink createDrink() {
        return new HotExclusiveDrink();
    }
}
