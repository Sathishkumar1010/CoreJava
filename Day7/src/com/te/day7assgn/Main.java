package com.te.day7assgn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList();
		List<Integer> list2=new ArrayList();
		Scanner scn=new Scanner(System.in);
		int num=5;
		System.out.println("Enter the 1st Arraylist values");
		for (int i = 0; i < num; i++) {
			list1.add(scn.nextInt());	
		}
		System.out.println("Enter the 2nd Arraylist values");
		for (int j = 0; j <num; j++) {
			list2.add(scn.nextInt());
		}
		System.out.println(SortArray.sortMergedArrayList(list1, list2));
		

	}

}
