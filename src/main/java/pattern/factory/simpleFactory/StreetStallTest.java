package pattern.factory.simpleFactory;

public class StreetStallTest {
	public static void main(String[] args) {
		SimpleNoodleFactory factory = new SimpleNoodleFactory();
		StreetStall streetStall = new StreetStall(factory);
		streetStall.sellColeNoodle("hot");
	}
}
