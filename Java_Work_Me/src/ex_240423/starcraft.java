package ex_240423;

public class starcraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zerg zerg1 = new zerg();
		zerg1.setDrone("9드론 생산");
		zerg1.makeMoney();
		zerg1.patrolDrone();
		String comment = "어쩌구 저쩌구 전략으로 할 거임"+"이러쿵 저러쿵 이겨낼거임";
		
		zerg1.setcomment(comment);
	}

}
