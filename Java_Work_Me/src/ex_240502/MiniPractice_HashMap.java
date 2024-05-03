package ex_240502;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import util.LocalDateTimeMake;
import util.RandomSelectNumber;
import util.dto.Person;

public class MiniPractice_HashMap {

	// 함수로 분리하기.
	public static void recommendNum(Scanner scanner, HashMap<String, Person> dic) {
		while (true) {
			System.out.println("====================================================================");
			System.out.println("연락처 프로그램(java.ver)");
			System.out.println("1. 연락처 입력, 2. 연락처 출력, 3. 검색하기, 4. 삭제하기, 5. 랜덤 뽑기, 6.종료하기");
			System.out.println("====================================================================");
			System.out.print("무엇을 하실건가요? >> ");
			String weather = scanner.next();

			if (weather.equals("6")) {
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				break;
			} else if (weather.equals("1")) {
				System.out.print("이름 입력 >>");
				String userName = scanner.next();
				System.out.print("번호 입력 (ex. 010-1234-5678) >>");
				String num = scanner.next();

				String nowTime = LocalDateTimeMake.now();
				Person person = new Person(userName, num, nowTime);

				dic.put(userName, person);

				System.out.println("초기 메뉴로 나오시려면 exit를 입력해주세요");
				String exit = scanner.next();

				while (!(exit.equals("exit"))) {
					System.out.println("초기 메뉴로 나오시려면 exit를 입력해주세요");
					exit = scanner.next();
				}

				continue;
			} else if (weather.equals("2")) {
				System.out.println("연락처 출력 >>");

				Set<String> keys = dic.keySet(); // 모든 키를 Set 컬렉션에 받아옴
				Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
				while (it.hasNext()) {
					String key = it.next(); // 키
					Person person = dic.get(key); // 값
					System.out.println("이름 : " + key + " 전번 : " + person.getPhoneNum() + " 생성 시간 : " + person.getDate());
				}

				continue;

			} else if (weather.equals("3")) {
				System.out.println("검색하기 (ex. 남귀연) >> ");
				String searchName = scanner.next();
//
				Set<String> keys = dic.keySet(); // 모든 키를 Set 컬렉션에 받아옴
//				Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
//				while (it.hasNext()) {
//					String key = it.next(); // 키
//					Person person = dic.get(key); // 값
//					if (key.equals(searchName)) {
//						Person person = dic.get(searchName);
//						System.out.println("이름 : " + key + " 전번 : " + person.getPhoneNum() + " 생성 시간 : " + person.getDate());
//						break;
//					}
//				}
				Person result = dic.get(searchName);
				if(result==null) {
					System.out.println("해당하는 "+searchName+"이 없습니다.");
				}
				else {
					System.out.println("이름 : " + result.getName() + " 전번 : " + result.getPhoneNum() + " 생성 시간 : " + result.getDate());
				}
				
			
				if (keys.isEmpty()) {
					System.out.println("검색한 "+searchName+"이 없습니다.");	
				} 
				
				continue;
				
			} else if (weather.equals("4")) {
				System.out.println("삭제할 이름 입력 >> ");
				String searchName = scanner.next();
				/*
				Set<String> keys = dic.keySet(); // 모든 키를 Set 컬렉션에 받아옴
				Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
				while (it.hasNext()) {
					String key = it.next(); // 키
					Person person = dic.get(key); // 값
					if (key.equals(searchName)) {
						keys.remove(key);
						System.out.println(searchName+"를 삭제했습니다.");
						break;
					}
				}*/
				Person value = dic.get(searchName);
				if(value==null) {
					System.out.println("해당하는 "+searchName+"이 없습니다.");	
				}
				else {
					dic.remove(searchName);
					System.out.println(searchName+"를 삭제했습니다.");
				}

			} else if (weather.equals("5")) {
				System.out.println("랜덤 뽑기>> ");
				LocalDateTimeMake.waitTime(3);
				
				ArrayList<String>keys = new ArrayList<String>(dic.keySet());
				//랜덤한 숫자 가져옴
//				int boundary = keys.size();
				int randomnum = RandomSelectNumber.selectInt(keys.size());
				
				//해당하는 랜덤수에 키가지고옴
				String randomkey = keys.get(randomnum);
				Person person = dic.get(randomkey);
				System.out.println("이름 : "+person.getName()+" 전번 : "+person.getPhoneNum()+" 생성 시간 : "+person.getDate());

			} else {
				System.out.println("1~5 사이의 수를 입력해주시길 바랍니다.");
			}
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		HashMap<String, Person> dic = new HashMap<String, Person>();
		recommendNum(scanner, dic);

	}
}
