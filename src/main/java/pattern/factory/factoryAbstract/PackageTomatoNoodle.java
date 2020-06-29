package pattern.factory.factoryAbstract;

/**
 * @author LSD
 * @date 2020/6/29 14:43
 */
public class PackageTomatoNoodle implements AbstractFactory {

    @Override
    public ColdNoodle createColdNoodles() {
        return new TomatoNoodle();
    }

    @Override
    public Drink createDrink() {
        return new TomatoExclusiveDrink();
    }
}
