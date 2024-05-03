package util;

import java.util.ArrayList;

import util.dto.lunchFood;

public class ArrayListUtils {
	public static void showArraylist(ArrayList<lunchFood> arraylist) {
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println("arraylist["+i+"] : "+arraylist.get(i));
		}
	}
}
