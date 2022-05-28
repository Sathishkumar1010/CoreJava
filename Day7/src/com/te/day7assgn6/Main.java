package com.te.day7assgn6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List list1=new ArrayList();
		List list2=new ArrayList();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Size of an ArrayList");
		int size=scn.nextInt();
		System.out.println("Enter the Values for 1st ArrayList");
		for(int i = 0; i < size; i++) {
			list1.add(scn.nextInt());	
		}
		System.out.println("Enter the Values for 2nd ArrayList");
		for (int j = 0; j <size; j++) {
			list2.add(scn.nextInt());
		}
		System.out.println(UserMainCode.generateOddEvenList(list1, list2));

	}

}
