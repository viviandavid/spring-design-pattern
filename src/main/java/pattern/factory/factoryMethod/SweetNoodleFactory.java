package pattern.factory.factoryMethod;

public class SweetNoodleFactory implements MethodNoodleFactory {
    @Override
    public ColdNoodle createColdNoodle() {
        return new SweetNoodle();
    }
}
