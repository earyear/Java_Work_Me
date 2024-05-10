package javaexam_0510;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		
		Random random = new Random();
		int num = random.nextInt(100) + 1;
		Scanner scanner= new Scanner(System.in);
		int cnt =0;
		
		System.out.println("=== 숫자맞추기 게임을 시작합니다. ===");
		System.out.println("컴퓨터가 숫자를 생각했습니다.");
		
		if(num%2==0) {
			System.out.println("힌트는 짝수입니다.");
		}
		else {
			System.out.println("힌트는 홀수입니다.");
		}
		
		while(true) {
			System.out.print("1~100 사이의 값을 입력 >> ");
			int myNum = scanner.nextInt();

			cnt++;
			
			if(myNum == num) break;
			else if(myNum > num) System.out.println("더 작은 수입니다.");
			else System.out.println("더 큰 수입니다.");
			
		}
		System.out.println(cnt+"회 만에 맞췄습니다.");
		System.out.println("=== 게임을 종료합니다.===");
	}

}
