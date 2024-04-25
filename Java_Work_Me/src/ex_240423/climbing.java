package ex_240423;

public class climbing {
	private String sportsName;
	private String sportsMember;
	private String sportsSeason;
	
	public static final String TEST ="하하하핳 이것이 전역 상수!";
	
	public static String t_method() {
		return TEST;
	}
	
	public String getSportsName() {
		return sportsName;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	public String getSportsMember() {
		return sportsMember;
	}
	public void setSportsMember(String sportsMember) {
		this.sportsMember = sportsMember;
	}
	public String getSportsSeason() {
		return sportsSeason;
	}
	public void setSportsSeason(String sportsSeason) {
		this.sportsSeason = sportsSeason;
	}
	
	
	public climbing(String sportsName, String sportsMember, String sportsSeason) {
		super();
		this.sportsName = sportsName;
		this.sportsMember = sportsMember;
		this.sportsSeason = sportsSeason;
	}
	
	public void start() {
		System.out.println("준비운동하기");
	}
	public void end() {
		System.out.println("스트레칭하기");
	}
	public void readdy(String r) {
		
		System.out.println("준비물 :"+r);
	}
	
	@Override
	public String toString() {
		return "climbing [sportsName=" + sportsName + ", sportsMember=" + sportsMember + ", sportsSeason="
				+ sportsSeason + "]";
	}
	
	
}
