package ex_240423;

public class Hello {
	//default, protect, private, public : 상속 및 특정 조건에 따른 접근이 가능함
	//static : 전역으로 사용함. 시스템에 전역공간(메모리) 미리 올라와 있다 <-> 인스턴스 : 클래스 생성자를 호출해서 객체를 만든다
	/*
	 static은 클래스 변수, 붙지 않으면 인스턴스 변수
	*/
	public static int sum(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		int i =20;
		
		int result =sum(200, 100);
		System.out.println(result);
		
	}
	
}
