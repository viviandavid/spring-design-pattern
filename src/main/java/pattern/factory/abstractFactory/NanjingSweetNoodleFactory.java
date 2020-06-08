package pattern.factory.abstractFactory;

public class NanjingSweetNoodleFactory extends NoodleFactory{
    @Override
    ColdNoodle createColdNoodle() {
        return new NanjingSweetNoodle();
    }
}
