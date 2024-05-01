package ex_240426;

public class callByMothod {

	public static void increase(int a) {
		a =a+1;
	}
	
	public static void increaseArray(int a[]) {
		for(int i=0; i<a.length; i++) {
			a[i]++;
		}
	}
	
	
	public static void main(String[] args) {
		// 기본형은 소멸, 참조형은 메모리 위치 주소값 생존
		
		// 기본형
		int n=10;
		increase(n);
		System.out.println("n : "+n);
		
		
		//참조형
		int a[]= {1,2,3,4,5};
		increaseArray(a);
		for(int i=0; i<a.length; i++) {
			System.out.println("array : "+a[i]);
		}
		
	}

}
