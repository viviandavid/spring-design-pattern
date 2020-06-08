package pattern.factory.abstractFactory;

public class ColdNoodle {
	public String name;
	public void prepare(MaterialFactory factory){
		Flour flour = factory.createFlour();
		Flavoring flavoring = factory.createFlavoring();
		System.out.println("采用国产最优质的的面粉："+flour.name+",调料："+flavoring.name);
		System.out.println(name+"取出凉皮 切成条状");
	}
	public void season(){
		System.out.println(name+"凉皮秘制调料");
	}
	public void pack(){
		System.out.println(name+"凉皮专用一次性包装盒");
	}
}
