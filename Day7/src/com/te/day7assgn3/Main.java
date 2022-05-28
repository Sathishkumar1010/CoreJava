package com.te.day7assgn3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		List list1=new ArrayList();
		System.out.println("Enter the Size of an ArrayList");
		int size=scn.nextInt();
		System.out.println("Enter the Array Elements");
		for (int i = 0; i <size; i++) {
			list1.add(scn.next());	

		}
		System.out.println(UserMainCode.removeMultiplesOfThree(list1));
	}
	

}
