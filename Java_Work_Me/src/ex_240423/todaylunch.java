package ex_240423;

public class todaylunch {

	public static void main(String[] args) {
		System.out.println("메인시작");
		
		koreanfood bab = new koreanfood("비빔밥", 9000, "본죽비빔밥");
		System.out.println("오늘 점심 메뉴 :"+bab.getFoodname());
		System.out.println("오늘 점심 가격 :"+bab.getFoodprice()+"원");
		System.out.println("오늘 점심 장소 :"+bab.getFoodplace());
		
		//전역상수 및 전역 메소드 사용
		String test = koreanfood.show();
		System.out.println("test 담긴 내용 : "+test);
		
		//hello.java의 전역함수 사용해보기
		//같은 패키지라서 임포트 필요없음
		int result = Hello.sum(500, 200);
		System.out.println(result);
		
	}

}
