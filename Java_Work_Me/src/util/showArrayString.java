package util;

public class showArrayString {
	
	public static void show(String[] array) {
		for (int i = 0; i < array.length; i++) {
			if(i==0) System.out.print(array[i]);
			else System.out.print(","+array[i]);
		}
	}

}
