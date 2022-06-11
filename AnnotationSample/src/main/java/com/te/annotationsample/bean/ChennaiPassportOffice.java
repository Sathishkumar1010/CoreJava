package com.te.annotationsample.bean;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class ChennaiPassportOffice implements HeadPassportOffice {
	@Autowired
	@Qualifier("chennai")
	private Document chennaiDocument;
	
	public Document getChennaiDocument() {
		return chennaiDocument;
	}

	public void setChennaiDocument(Document chennaiDocument) {
		this.chennaiDocument = chennaiDocument;
	}

	public void doPhotoVerification() {
		
		System.out.println("Photo verification done using "+chennaiDocument.getIdProof());
		
	}

	public void issuePassport() {
		
		System.out.println("Passport issue is in progress for "+chennaiDocument.getName()+" from "+chennaiDocument.getCity() +" office");
		
	}

	
	



}
