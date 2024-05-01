package ex_240426_2;


public class ProtectedTest_2 {

	public class B{
		protected int n;
		protected void g() {
			n=5;
		}
	}
	
	class C{
		
		protected void k() {
			B b = new B();
			b.n = 7;
			b.g();
		}
	}
	
	public static void main(String[] args) {
		
	}

}
