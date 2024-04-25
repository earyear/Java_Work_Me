package ex_240423_2;

import java.util.Scanner;

public class scanner_test {

	public static void main(String[] args) {
		// 스캔함요
		System.out.println("취미활동은 뭔가요?");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		
		System.out.println("취미활동 : "+name);
	}

}
