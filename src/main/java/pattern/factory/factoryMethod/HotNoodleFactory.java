package pattern.factory.factoryMethod;

public class HotNoodleFactory implements MethodNoodleFactory {

    @Override
    public ColdNoodle createColdNoodle() {
        return new HotNoodle();
    }
}
