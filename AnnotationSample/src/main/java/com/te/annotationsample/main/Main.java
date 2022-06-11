package com.te.annotationsample.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.annotationsample.bean.BangalorePassportOffice;
import com.te.annotationsample.bean.ChennaiPassportOffice;
import com.te.annotationsample.config.AppConfig;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Select Location");
		System.out.println("1.Chennai");
		System.out.println("2.Bangalore");
		int input=scn.nextInt();
		switch (input) 
		{
		case 1:
			ChennaiPassportOffice cpo=(ChennaiPassportOffice) context.getBean("chennaipassportoffice");
			cpo.doPhotoVerification();
			cpo.issuePassport();
			break;
		case 2:
			BangalorePassportOffice bpo=(BangalorePassportOffice) context.getBean("bangalorepassportoffice");
			bpo.doPhotoVerification();
			bpo.issuePassport();
			
			
			break;
		default:
			System.out.println("Input is Invalid");
		}
		
		
		
		
	}

}
