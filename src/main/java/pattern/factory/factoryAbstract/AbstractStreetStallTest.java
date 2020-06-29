package pattern.factory.factoryAbstract;

public class AbstractStreetStallTest {
	public static void main(String[] args) {
		AbstractFactory factory = new PackageHotNoodle();
		StreetStall streetStall = new StreetStall(factory);
		streetStall.sellPackage();
		System.out.println("======================");
		AbstractFactory factory1 = new PackageSweetNoodle();
		StreetStall streetStall1 = new StreetStall(factory1);
		streetStall1.sellPackage();
		System.out.println("======================");
		AbstractFactory factory2 = new PackageTomatoNoodle();
		StreetStall streetStall2 = new StreetStall(factory2);
		streetStall2.sellPackage();
	}
}
