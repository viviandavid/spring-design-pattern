package pattern.factory.abstractFactory;

public class NanjingTomatoNoodleFactory extends NoodleFactory {
    @Override
    ColdNoodle createColdNoodle() {
        return new NanjingTomatoNoodle();
    }
}
