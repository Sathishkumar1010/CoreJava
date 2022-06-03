package com.te.day10assgn1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class UserMainCode1 {
	static String getAge(String str1,String str2)
	{
		Date d1=new Date(str1);
		Date d2=new Date(str2);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String date1=sdf.format(d1);
		String date2=sdf.format(d2);
		long diff=UserMainCode1.yearDiff(date1, date2);
		
		if(diff>=18)
			return "Eligible for Voting";
		else
			return "Not Eligible for Voting";
		
	}
	public static long yearDiff(String date1,String date2)
	{
		return ChronoUnit.YEARS.between(LocalDate.parse(date1), LocalDate.parse(date2));
		
	}

}

