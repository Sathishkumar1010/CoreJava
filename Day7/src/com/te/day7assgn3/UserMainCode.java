package com.te.day7assgn3;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
	
	static List removeMultiplesOfThree(List list1){
		List list2=new ArrayList();
		for (int i = 0; i <list1.size(); i++) {
			if((i+1)%3!=0) {
				list2.add(list1.get(i));
			}
		}
		
		return list2;
		
	}

}
