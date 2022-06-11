package com.te.annotationsample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.te.annotationsample.bean.BangalorePassportOffice;
import com.te.annotationsample.bean.ChennaiPassportOffice;
import com.te.annotationsample.bean.Document;

@Configuration
@ComponentScan("com.te")
public class AppConfig {
	
	@Bean("chennaipassportoffice")
	public ChennaiPassportOffice getChennaiPassportOffice() {
		return new ChennaiPassportOffice();
	}
	
	
	@Bean("bangalorepassportoffice")
	public BangalorePassportOffice getBangalorePassportOffice() {
		return new BangalorePassportOffice();
	}

	@Bean("chennai")
	public Document chennaiDocument()
	{
		return new Document("Joe", "Driving Licence", "Chennai");
	}
	
	@Bean("bangalore")
	public Document bangaloreDocument()
	{
		return new Document("Jhon", "Aadhar Card", "Bangalore");
	}
}
