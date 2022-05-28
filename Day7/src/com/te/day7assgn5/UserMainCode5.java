package com.te.day7assgn5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserMainCode5 {
	static List arrayListSubtractor(List list1,List list2)
	{
		List list3=new ArrayList();
		list3.addAll(list1);
		list1.removeAll(list2);
		list2.removeAll(list3);
		list1.addAll(list2);
		Collections.sort(list1);
		return list1;
	}

}
