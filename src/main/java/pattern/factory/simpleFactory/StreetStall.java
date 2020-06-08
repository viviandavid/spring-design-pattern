package pattern.factory.simpleFactory;

public class StreetStall {

	private SimpleNoodleFactory factory;
	public StreetStall(SimpleNoodleFactory factory){
		this.factory = factory;
	}
	public ColdNoodle sellColeNoodle(String type){
		ColdNoodle coldNoodle = factory.createColdNoodle(type);
		coldNoodle.prepare();
		coldNoodle.season();
		coldNoodle.pack();
		return coldNoodle;
	}

}
