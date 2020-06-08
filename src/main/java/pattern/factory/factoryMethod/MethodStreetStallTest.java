package pattern.factory.factoryMethod;

public class MethodStreetStallTest {
	public static void main(String[] args) {
		MethodNoodleFactory factory;
		factory = HotNoodle::new;
		StreetStall streetStall = new StreetStall(factory);
		streetStall.sellColeNoodle();
	}
}
