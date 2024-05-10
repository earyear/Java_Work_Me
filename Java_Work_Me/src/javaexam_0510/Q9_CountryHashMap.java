package javaexam_0510;

import java.util.HashMap;
import java.util.Scanner;

public class Q9_CountryHashMap {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		System.out.println("나라 이름과 인구를 5개 입력하세요. (예: Korea 5000)");

		for (int i = 0; i < 5; i++) {
			
			System.out.print("나라 이름, 인구 >> ");
			String linetext = scanner.nextLine();


			String[] parts = linetext.split(" ");

			if (parts.length != 2) {
				System.out.println("잘못된 형식입니다. 나라 이름과 인구를 공백으로 구분하여 입력하세요.");
				continue;
			}

			String name = parts[0];
			int population = Integer.parseInt(parts[1]);

			nations.put(name, population);
		}

		String smallestCountry = null;
        int smallestPopulation = Integer.MAX_VALUE;

        for (String country : nations.keySet()) {
            int Pop = nations.get(country);
            if (Pop < smallestPopulation) {
                smallestPopulation = Pop;
                smallestCountry = country;
            }
        }
        
        System.out.println("제일 인구가 적은 나라는 ("+smallestCountry+", "+smallestPopulation+")");
	}

}
