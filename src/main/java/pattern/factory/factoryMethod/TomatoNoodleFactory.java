package pattern.factory.factoryMethod;

public class TomatoNoodleFactory implements MethodNoodleFactory {
    @Override
    public ColdNoodle createColdNoodle() {
        return new TomatoNoodle();
    }
}
