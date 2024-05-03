package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeMake {
	public static String now() {
		
		// 년,월,일, 시,분,초 -> 포맷팅도 다하게끔.
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		String nowString = now.format(dateTimeFormatter);
		return nowString;
	}
	public static void waitTime(int num) {
		System.out.println("=============="+num+"초 대기==============");
		for(int i=num; i>0; i--) {
			System.out.println(i+"초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
