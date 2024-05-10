package javaexam_0510;

import java.util.HashMap;
import java.util.Scanner;

public class Q8_DrinkHashMap {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		HashMap<String, Integer> Drink = new HashMap<String, Integer>();
		Drink.put("코카콜라", 800);
		Drink.put("밀키스", 700);
		Drink.put("펩시", 1000);
		Drink.put("칠성사이다", 1200);
		
		System.out.println("밀키스, 코카콜라, 펩시, 칠성사이다 있습니다.");
		
		while(true) {
			System.out.print("선택 >> ");
			String linetext = scanner.nextLine();
			
			if(linetext.equals("그만")) break;
			
    		Integer search = Drink.get(linetext);
    		
    		if(search ==null)
    			System.out.println("해당하는 음료수가 없습니다.");
    		else 
    			System.out.println(linetext + "는 " + search + "원 입니다.");
			
		}
		System.out.println("종료합니다...");

	}

}
