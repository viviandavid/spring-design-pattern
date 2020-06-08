package pattern.factory.abstractFactory;


public class NanjingStreetStall extends StreetStall {

	private NoodleFactory factory;
	public NanjingStreetStall(NoodleFactory factory){
		this.factory = factory;
	}

	@Override
	public ColdNoodle sellColdNoodle() {
		ColdNoodle coldNoodle = factory.createColdNoodle();
		coldNoodle.prepare(new ChinaMaterialFactory());
		coldNoodle.season();
		coldNoodle.pack();
		return coldNoodle;
	}
}
