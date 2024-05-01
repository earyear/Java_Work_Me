package util;

import java.util.Vector;

public class CollectionUtils {
	
	public static void ds(Vector<String> vector) {
		for (int i = 0; i <vector.size(); i++) {
			if(i==0) System.out.print(vector.get(i));
			else System.out.print(","+vector.get(i));
		}
		System.out.println();
	}
	
	public static void search(String str, Vector<String> vector) {
		for (int i = 0; i <vector.size(); i++) {
			if(str.equals(vector.get(i))) System.out.println(str+"라는 메뉴가 있습니다.");
			else System.out.println(str+"라는 메뉴가 없습니다.");
		}
	}
	
	public static void dds(int wantint, Vector<String> vector) 
	{
		for(int i=0; i < wantint; i++) {
			vector.add("더미 데이터 : "+i);
		}
	}	

}
