package pattern.factory.abstractFactory;


public class NanjingStreetStallTest {
	public static void main(String[] args) {
		NoodleFactory factory = new NanjingHotNoodleFactory();
		NanjingStreetStall streetStall = new NanjingStreetStall(factory);
		streetStall.sellColdNoodle();
	}
}
