package ex_240423;

public class koreanfood {
	private String foodname;
	private int foodprice;
	private String foodplace;
	
	//전역 상수
	private static final String TEST ="오늘 점심 메뉴 선정 프로젝트";
	
	
	//방법 1, 반자동..우클릭 > resource > getter/setter
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public int getFoodprice() {
		return foodprice;
	}
	public void setFoodprice(int foodprice) {
		this.foodprice = foodprice;
	}
	public String getFoodplace() {
		return foodplace;
	}
	public void setFoodplace(String foodplace) {
		this.foodplace = foodplace;
	}
	
	//방법 2, lombok 라이브러리 이용
	
	
	//생성자 만들기
	public koreanfood(String foodname, int foodprice, String foodplace) {
		super();
		this.foodname = foodname;
		this.foodprice = foodprice;
		this.foodplace = foodplace;
	}
	
	//static 전역 메소드, 해당 클래스명으로 바로 접근 가능
	//why? 클래스가 이미 실행 시점에 메모리에 로드 되어 있어서
	public static String show() {
		return TEST;
	}
	public void showall() {
		System.out.println("오늘 점메 : "+this.foodname+"가격 :"+this.foodplace);
	}
}
