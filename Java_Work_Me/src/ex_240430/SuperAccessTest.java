package ex_240430;

//class Parent {
//	private String parentN;
//
//	public void make() {
//		System.out.println("난 부모");
//	}
//}
//
//class Child extends Parent {
//	private String ChildN;
//
//	public void make() {
//		System.out.println("난 자식");
//	}
//}
//
//public class SuperAccessTest {
//
//	public static void main(String[] args) {
//		// 업캐스팅, 부모 = 자식
//		Parent p1 = new Child();
//		p1.make();
//
//		// 다운캐스팅
//		Child c1 = (Child) p1;
//	}
//
//}

class SuperObject {
	protected String name;

	public void paint() {
		draw();
	}

	public void draw() {
		System.out.println(name);
	}
}

public class SuperAccessTest extends SuperObject {
	protected String name;

	public void draw() {
		name = "Sub";
		super.name = "Super";
		super.draw();
		System.out.println(name);
	}

	public static void main(String[] args) {
		SuperObject b = new SuperAccessTest();
		b.paint();
	}
}