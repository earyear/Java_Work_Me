package javaexam_0510;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Q7_BankHashMap {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> bankBook = new HashMap<String, Integer>();

		System.out.println("<< 통장 관리 프로그램입니다. >>");

		while (true) {
			System.out.print("이름과 금액 입력>>");
			String linetext = scanner.nextLine();

			if (linetext.equals("exit"))
				break;

			String[] parts = linetext.split(" ");

			if (parts.length != 2) {
				System.out.println("잘못된 형식입니다. 이름과 잔액을 공백으로 구분하여 입력하세요.");
				continue;
			}

			String name = parts[0];
			int money = Integer.parseInt(parts[1]);

			if (bankBook.containsKey(name)) {
				bankBook.put(name, bankBook.get(name)+money);
			} else {
				bankBook.put(name, money);
			}

			Set<String> keys = bankBook.keySet(); // 모든 키를 Set 컬렉션에 받아옴
			Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
			while (it.hasNext()) {
				String key = it.next(); // 키
				Integer value = bankBook.get(key); // 값
				System.out.print("(" + key + ">" + value + "원)");
			}
			System.out.println();

		}
		System.out.println("프로그램을 종료합니다...");

	}

}
