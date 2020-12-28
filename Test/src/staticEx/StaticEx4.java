package staticEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StaticEx4 {
	
	public static String getCurrentDate(String fmt) {
		SimpleDateFormat sdf = new SimpleDateFormat(fmt);
		return sdf.format(new Date());
	}
	
	public static void main(String[] args) {
		
		System.out.println(StaticEx4.getCurrentDate("yyyyMMdd")); // 오늘의 연 월 일
	}

}
