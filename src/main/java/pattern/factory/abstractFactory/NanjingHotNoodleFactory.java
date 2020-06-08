package pattern.factory.abstractFactory;

public class NanjingHotNoodleFactory extends NoodleFactory{
    @Override
    ColdNoodle createColdNoodle() {
        return new NanjingHotNoodle();
    }
}
