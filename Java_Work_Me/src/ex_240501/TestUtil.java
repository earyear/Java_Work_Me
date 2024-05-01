package ex_240501;

import util.RandomSelectNumber;
import util.showArrayString;

public class TestUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = RandomSelectNumber.selectInt(5);
		System.out.println("랜덤 숫자 : "+result);
		
		String[] lunchmenu = {"낙지김치죽","수제비","칼국수","김밥","라면","쌀쌀국수"};
		showArrayString.show(lunchmenu);
	}

}
