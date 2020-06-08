package pattern.factory.factoryMethod;

public class StreetStall {

	private MethodNoodleFactory factory;
	public StreetStall(MethodNoodleFactory factory){
		this.factory = factory;
	}
	public ColdNoodle sellColeNoodle(){
		ColdNoodle coldNoodle = factory.createColdNoodle();
		coldNoodle.prepare();
		coldNoodle.season();
		coldNoodle.pack();
		return coldNoodle;
	}

}
