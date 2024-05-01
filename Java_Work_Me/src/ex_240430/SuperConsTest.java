package ex_240430;


class A{
	public A() {
		System.out.println("생성자 A()호출");
	}
}
class B extends A{
	public B() {
		System.out.println("생성자 B()호출");
	}
}
class C extends A{
	public C() {
		System.out.println("생성자 C()호출");
	}
}


public class SuperConsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
	}

}
