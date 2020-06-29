package pattern.factory.factoryAbstract;

/**
 * @author LSD
 * @date 2020/6/29 14:34
 */
public interface AbstractFactory {

    public ColdNoodle createColdNoodles();

    public Drink createDrink();
}
