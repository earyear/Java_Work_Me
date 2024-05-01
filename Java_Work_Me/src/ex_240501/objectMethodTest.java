package ex_240501;

class Person{
	private String name, email;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//toString 재정의 안함. 따라서, toString는 object를 사용함 > 메모리주소값이 나옴
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}

	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	//equals 재정의
	public boolean equals(Person p) {
		if(p.getName()==this.name && p.getEmail()==this.email) return true;
		else return false;
	}
}

public class objectMethodTest {

	public static void main(String[] args) {
		Person p1 =new Person("남귀연","ngy@email.com");
		Person p2 =new Person("남귀연","ngy@email.com");
		String result = p1.toString();
		System.out.println("Person의 tostring 이용해서 출력한 결과 : "+result);
		
		System.out.println(p1.equals(p2));
		
	}

}
