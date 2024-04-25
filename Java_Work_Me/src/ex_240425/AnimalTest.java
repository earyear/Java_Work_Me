package ex_240425;

public class AnimalTest {

	public static void main(String[] args) {
		
//		cat cat1 = new cat();
//		cat1.setName("종강");
//		cat1.setAge(2);
//		
//		String[] catfood = {"츄르","캔","정어리"};
//		cat1.setLovefood(catfood);
//		cat1.setPlace("기숙사");
//		
//		
//		System.out.println(cat1.toString());
//		cat1.action("우다다다");
//		cat1.speakSound("냐나오옹");
//		System.out.println("고양이가 사는 곳 : "+cat1.getPlace());
//		
//		
		
		String[] pandafoodString = {"대나무","사과","바나나"};
		
		panda bao1 = new panda();
		bao1.setName("아이바오");
		bao1.setAge(8);
		bao1.setLovefood(pandafoodString);
		bao1.setFamily("엄마");
		bao1.setPlace("에버랜드");
		
		System.out.println(bao1.toString());
		bao1.action("뒹굴~");
		bao1.speakSound("와구");
		System.out.println("판다가 사는 곳: "+bao1.getPlace());
		System.out.println("가족 구성: "+bao1.getFamily());
		bao1.hobby("누워자기");
		bao1.dream("슈퍼스타");
	}

}
