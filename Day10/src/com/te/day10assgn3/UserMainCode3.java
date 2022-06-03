package com.te.day10assgn3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UserMainCode3 {

	static int getLastDateOfMonth(String str) throws ParseException
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		 Date date=sdf.parse(str); 
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(date);
	      int res = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		return res;
	}
}
