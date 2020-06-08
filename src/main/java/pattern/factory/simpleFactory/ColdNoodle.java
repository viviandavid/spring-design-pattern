package pattern.factory.simpleFactory;

public class ColdNoodle {
	public String name;
	public void prepare(){
		System.out.println(name+"取出凉皮 切成条状");
	}
	public void season(){
		System.out.println(name+"凉皮秘制调料");
	}
	public void pack(){
		System.out.println(name+"凉皮专用一次性包装盒");
	}
}
