package ex_240425;

public class Array2dTest {

	public static void main(String[] args) {
//		int arr[][]= new int[3][2];
//		arr= {{1,2,3},{4,5,6}};
		int arr[][] = {{1,2,3},{4,5,6}};
		
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(i+"행, "+j+"열 "+"값 :"+arr[i][j]);
			}
		}
		
	}

}
