package ex_240423;

public class zerg {
	private String drone;
	private String zergling;
	private String hehe;
	
	//setter/getter
	public String getDrone() {
		return drone;
	}
	public void setDrone(String drone) {
		this.drone = drone;
	}
	public String getZergling() {
		return zergling;
	}
	public void setZergling(String zergling) {
		this.zergling = zergling;
	}
	public String getHehe() {
		return hehe;
	}
	public void setHehe(String hehe) {
		this.hehe = hehe;
	}
	
	//드론 일하기 메소드 만들기
	public void makeMoney() {
		System.out.println("드론으로 미네랄, 가스 같이 채취하기");
	}
	
	public void patrolDrone() {
		System.out.println("드론으로 정찰 보내기!");
	}
	
	public void setcomment(String a) {
		System.out.println("헤이 : "+a);
	}
	
	
	public zerg(String drone, String zergling, String hehe) {
		super();
		this.drone = drone;
		this.zergling = zergling;
		this.hehe = hehe;
	}
	
	public zerg() {
		
	}
	
	@Override
	public String toString() {
		return "zerg [drone=" + drone + ", zergling=" + zergling + ", hehe=" + hehe + "]";
	}
	
	
}
