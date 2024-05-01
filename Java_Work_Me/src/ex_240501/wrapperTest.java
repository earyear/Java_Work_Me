package ex_240501;

public class wrapperTest {

	public static void main(String[] args) {
		// wrapper클래스, 기본형 > 참조형(객체). 타입변경(박싱)
		
		Integer integer =Integer.valueOf(30);
		
		int bitcount=integer.bitCount(31);
		System.out.println(bitcount);

		
	}
	
}
