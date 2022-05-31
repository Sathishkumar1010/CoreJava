package com.te.assgn1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Seat s=new Seat();
		List<Seat> list=new ArrayList<Seat>();
		System.out.println("Entet the Number of Seats");
		int num=scn.nextInt();
		System.out.println("Enter the Passengers Details");
		for(int i=0;i<num;i++)
		{
			String input=scn.next();
			list.add(s.createSeat(input));
				
		}
		System.out.println("Passenger Details Are");
		System.out.format("%-10s %-15s %-20s %-25s %-30s", "SeatNo","type","Price","Passnger Name","Gender");
		System.out.println();
		for (Seat seat : list) {
			System.out.println(seat);
		}
		System.out.println();
		System.out.println("Enter Type of Sort 1.By Seatno 2.Passenger Name");
		int option=scn.nextInt();
		switch(option)
		{
		case 1:
			Collections.sort(list);
			System.out.format("%-10s %-15s %-20s %-25s %-30s", "SeatNo","type","Price","Passnger Name","Gender");
			System.out.println();
			for (Seat seat : list) {
				System.out.println(seat);
			}
			break;
		case 2:
			Collections.sort(list,new PassengerNameComperator());
			System.out.format("%-10s %-15s %-20s %-25s %-30s", "SeatNo","type","Price","Passnger Name","Gender");
			System.out.println();
			for (Seat seat : list) {
				System.out.println(seat);
			}
			
			break;
		default:
			System.out.println("Invalid Option");
			
		

	}

	}
}
