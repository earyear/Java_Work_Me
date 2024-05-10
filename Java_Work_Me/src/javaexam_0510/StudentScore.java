package javaexam_0510;

public class StudentScore {
	
	public static void main(String[] args) {

		System.out.println("학생번호   국어  영어  수학   총점   평균");
		System.out.println("==================================");
		
		int[][] scores = { { 80, 60, 70 }, { 90, 95, 80 }, { 75, 80, 100 }, { 80, 70, 95 }, { 100, 65, 80 } };
		
		
		for(int i=0; i<5; i++) {
			int sum=0;
			double avg=0;
			System.out.print((i+1)+"번 학생:  ");
			
			for(int j=0; j<3; j++) {
				sum +=scores[i][j];
				System.out.print(scores[i][j]+"   ");
			}
			avg = sum/3;
			System.out.println(sum+"  "+avg);
		}
	}

}
