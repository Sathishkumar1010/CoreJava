package com.te.day7assgn5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List list1=new ArrayList();
		List list2=new ArrayList();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Size of an 1st ArrayList");
		int size1=scn.nextInt();
		System.out.println("Enter the Values for 1st ArrayList");
		for(int i = 0; i < size1; i++) {
			list1.add(scn.nextInt());	
		}
		System.out.println("Enter the Size of an 2nd ArrayList");
		int size2=scn.nextInt();
		System.out.println("Enter the Values for 1st ArrayList");
		for (int j = 0; j <size2; j++) {
			list2.add(scn.nextInt());
		}
		System.out.println(UserMainCode5.arrayListSubtractor(list1, list2));
	}

}
