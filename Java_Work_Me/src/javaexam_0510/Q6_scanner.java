package javaexam_0510;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q6_scanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String linetext = scanner.nextLine();
			if(linetext.equals("exit")) break;

			StringTokenizer st = new StringTokenizer(linetext,",");
			int n = st.countTokens(); //어절 개수
			System.out.println("어절 개수는 "+n);
		}
		System.out.println("종료합니다...");
		
	}

}
