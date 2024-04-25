package ex_240425;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("정수 3개 입력해주세요");
		
		int sum =0, n=0;
		for(int i=0; i<3; i++) {
			System.out.println(i+">>");
			try {
				//예외를 위해 정수 말고 문자열 입력하기
				n= s.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("잘못입력했슈 정수로 입력해줘어~");
				s.next();
				i--;
				continue;
			}
			sum +=n;
		}
		System.out.println("합 : "+sum);
		
		s.close();
	}

}
