package pattern.factory.simpleFactory;

public class SimpleNoodleFactory {

	ColdNoodle createColdNoodle(String type){
		ColdNoodle coldNoodle = null;
		switch (type){
			case "sweet":
				coldNoodle = new SweetNoodle();
				break;
			case "hot":
				coldNoodle = new HotNoodle();
				break;
			case "tomato":
				coldNoodle = new TomatoNoodle();
				break;
			default:
				coldNoodle = new HotNoodle();
				break;
		}
		return coldNoodle;
	}
}
