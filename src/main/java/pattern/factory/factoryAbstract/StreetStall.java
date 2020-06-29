package pattern.factory.factoryAbstract;

public class StreetStall {

	private AbstractFactory abstractFactory;
	public StreetStall(AbstractFactory factory){
		this.abstractFactory = factory;
	}
	public void sellPackage(){
		ColdNoodle coldNoodle = abstractFactory.createColdNoodles();
		Drink drink = abstractFactory.createDrink();
		coldNoodle.prepare();
		coldNoodle.season();
		drink.create();
		coldNoodle.pack();
	}

}
