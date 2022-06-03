package com.te.day10assgn2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class UserMainCode2 {
	public static boolean isLeapYear(String str) throws ParseException
	{
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date d1=sdf.parse(str);
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		String str1=sdf1.format(d1);
		LocalDate localdate=LocalDate.parse(str1);
		System.out.println(localdate);
		boolean status=localdate.isLeapYear();
		
		return status;
	}

}
