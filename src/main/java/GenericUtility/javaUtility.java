package GenericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class javaUtility {
	public String getCalenderDetails(String pattern) {
		Calendar cal=Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String value=sdf.format(d);
		return value;
	}
	public int getRandomNumber(int bound) {
		Random r=new Random();
		int num=r.nextInt(bound);
		return num;
	}
	

}





