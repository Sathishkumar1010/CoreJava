package com.te.assgn1;


public class Seat implements Comparable<Seat>{

	@Override
	public int compareTo(Seat o) {
		return o.getSeatNo()-this.getSeatNo();
	}

	private Integer seatNo;
	private String type;
	private Double price;
	private String passengerName;
	private String gender;
	public static Seat createSeat(String details)
	{
		String[] str=details.split(",");
		return new Seat(Integer.parseInt(str[0]), str[1], Double.parseDouble(str[2]), str[3], str[4]);
		
	}
	public Seat()
	{
		
	}
	public Seat(Integer seatNo, String type, Double price, String passengerName, String gender) {
		super();
		this.seatNo = seatNo;
		this.type = type;
		this.price = price;
		this.passengerName = passengerName;
		this.gender = gender;
	}
	public Integer getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(Integer seatNo) {
		this.seatNo = seatNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return String.format("%-10s %-15s %-20s %-25s %-30s",seatNo,type,price,passengerName,gender);
	//return String.format("%-15s %-25s %-35s &-45s", empId,employeeName,salary,desigination);
	}

	
	}
	
	

