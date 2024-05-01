package ex_240501_2;

import java.util.Vector;
import util.CollectionUtils;
import java.util.Scanner;
/*
class Person{
	public String name;
	public Vector<String> foodlist;
}*/

public class miniTest_vector {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Vector<String> v = new Vector<String>();

		System.out.println("1. 메뉴 입력, 2. 메뉴 출력, 3. 검색하기 , 4. 종료하기.");
		String main = s.next();

		while (true) {
			if (main.equals("4"))
				break;

			if (main.equals("1")) {
				System.out.print("메뉴를 입력해주세요 >> ");
				String menu = s.next();
				
				v.add(menu);
				
				System.out.println("초기 메뉴로 나오시려면 exit를 입력해주세요");
				String exit = s.next();
				
				while(!(exit.equals("exit"))) {
					System.out.println("초기 메뉴로 나오시려면 exit를 입력해주세요");
					exit = s.next();
				}
		
			}
			else if(main.equals("2")) {
				CollectionUtils.ds(v);
			}
			else if(main.equals("3")) {
				System.out.print("검색해주세요 >> ");
				String menu = s.next();
				CollectionUtils.search(menu,v);
			}
			else {
				System.out.println("1~4를 입력해주시길 바랍니다.");
			}
			
			System.out.println("1. 메뉴 입력, 2. 메뉴 출력, 3. 검색하기 , 4. 종료하기.");
			main = s.next();
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
