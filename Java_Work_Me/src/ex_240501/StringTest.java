package ex_240501;

public class StringTest {

	public static void main(String[] args) {
		
		String java ="java";
		String bus ="bus";
		
		//기존 문자열, anotherst 비교
		int javacompareBus = java.compareTo(bus);
		System.out.println("javacompareBus : "+javacompareBus);
		
		int buscompareBuse = bus.compareTo(java);
		System.out.println("buscompareJava : "+buscompareBuse);
		
		int buscompareBus = bus.compareTo(bus);
		System.out.println("buscompareBus : "+buscompareBus);
	}

}
