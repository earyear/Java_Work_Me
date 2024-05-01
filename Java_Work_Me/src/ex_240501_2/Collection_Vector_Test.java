package ex_240501_2;

import java.util.Vector;

import util.CollectionUtils;

public class Collection_Vector_Test {

	public static void main(String[] args) {
		
		String array[]=new String[3];
		
		Vector<String> vectorStrings = new Vector<String>();
		System.out.println("vector의 기본 용량 : "+vectorStrings.capacity());
		
		vectorStrings.add("초밥");
		
		CollectionUtils.ds(vectorStrings);
		
		vectorStrings.add("죽");
		CollectionUtils.ds(vectorStrings);
		
		vectorStrings.remove(0);
		CollectionUtils.ds(vectorStrings);
		
		
		
		
		
		CollectionUtils.dds(20, vectorStrings);
		System.out.println();
		System.out.println("===============");
		CollectionUtils.ds(vectorStrings);
		
		
	}
	
	
	
}
