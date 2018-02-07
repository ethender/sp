package com.yodhaa.sp.util;

import java.util.Calendar;

public class RegistrationUtil {

	public String getRefNumber(int num) {
		Calendar cal = Calendar.getInstance();
		String starting; 
		
		int month = cal.get(Calendar.MONTH)+1;
		if(month < 10) {
			starting= cal.get(Calendar.YEAR)+"0"+month;
		}else {
			starting= cal.get(Calendar.YEAR)+""+month;
		}

		if(num < 10) {
			return starting+"000"+num;
		}else if(num < 100) {
			return starting+"00"+num;
		}else if(num < 1000) {
			return starting+"0"+num;
		}else {
			return starting+""+num;
		}
	}
	
}
