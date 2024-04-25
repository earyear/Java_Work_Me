package ex_240425;

public class ArrayMethod {
	
	public static String[] makearray() {
		String[] temparr = new String[3];
		for(int i=0; i<temparr.length; i++) {
			temparr[i] ="먹고 싶은 메뉴 "+i;
		}
		return temparr;
	}
	
	public static void main(String[] args) {

		String luncharr[];
		luncharr = makearray();
		for(int i=0; i<luncharr.length; i++) {
			System.out.println("기본값 출력 : "+luncharr[i]);
		}
		int lunchadd = System.identityHashCode(luncharr);
		System.out.println("luncharr의 주소값 : "+lunchadd);
		
		
		String luncharr2[];
		luncharr2 = makearray();
		for(int i=0; i<luncharr2.length; i++) {
			System.out.println("기본값 출력 : "+luncharr2[i]);
		}
		int lunchadd2 = System.identityHashCode(luncharr2);
		System.out.println("luncharr의 주소값 : "+lunchadd2);
	}

}
