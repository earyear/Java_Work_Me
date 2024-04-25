package ex_240423;

public class sports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		climbing ya = new climbing("이름","2","사시사철");
		
		System.out.println(ya.getSportsSeason());
		
		String item ="클밍화, 초크, 편한 바지, 마인드";
		ya.readdy(item);
		ya.end();
		
		//전역 상수 및 전역 메소드 사용
//		String t1 = climbing.TEST;
		String t2 = climbing.t_method();
		System.out.println("전역 상수의 내용 출력 : "+climbing.TEST);
		System.out.println("전역 메소드의 내용 출력 : "+t2);
		
		
		System.out.println("오버라이드 출력 : "+ya);
	}

}
