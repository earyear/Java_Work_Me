package ex_240502;

import java.time.LocalDate;
import java.util.ArrayList;

import util.ArrayListUtils;
import util.LocalDateTimeMake;
import util.dto.lunchFood;

public class ArraylistTest {

	public static void main(String[] args) {
		// 점심메뉴 모델 DTO(Data Transfer Object) 클래스
		// VO(Value Object), 데이터베이스와 관련된 클래스
		
//		lunchFood(String foodName, int foodPrice, LocalDate foodRegDate, LocalDate foodmodDate, String location)		
		
//		LocalDate currentDate = LocalDate.now();
		String nowTime = LocalDateTimeMake.now();
		
		//메뉴추가
		lunchFood lunchFood = new lunchFood("김치찌개", 9000, nowTime, nowTime, "서면");
		lunchFood lunchFood2 = new lunchFood("마제소바", 9000, nowTime, nowTime, "칸다소바 부산서면점");
		lunchFood lunchFood3 = new lunchFood("카레", 9000, nowTime, nowTime, "은하수식당");
		
		ArrayList<lunchFood> lunchFoodList = new ArrayList<lunchFood>();
		lunchFoodList.add(lunchFood);
		lunchFoodList.add(lunchFood2);
		lunchFoodList.add(lunchFood3);
		
		ArrayListUtils.showArraylist(lunchFoodList);
		
		System.out.println(lunchFood.toString());
	}

}
