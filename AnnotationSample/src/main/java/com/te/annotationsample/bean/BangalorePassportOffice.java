package com.te.annotationsample.bean;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


public class BangalorePassportOffice  implements HeadPassportOffice{

	
	private Document bangaloreDocument;
	

public Document getBangaloreDocument() {
		return bangaloreDocument;
	}

	public void setBangaloreDocument(Document bangaloreDocument) {
		this.bangaloreDocument = bangaloreDocument;
	}

public void doPhotoVerification() {
		
	System.out.println("Photo verification done using "+bangaloreDocument.getIdProof());
		
	}

	public void issuePassport() {
		
		System.out.println("Passport issue is in progress for  "+bangaloreDocument.getName()+"from "+bangaloreDocument.getCity() +" office");
		
	}

	

}
