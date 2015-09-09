package com.gonz.uh.model;

public class Patient {

	public static final String MALE = "Hombre";
	public static final String FEMALE = "Mujer";
	
	private String sip;
	private String name;
	private String dni;
	private String address;
	private String age;
	private String gender;
	private String phoneNumber;
	private String imageURL;
	
	public Patient(String sip) {
		
		this.sip = sip;
		this.name = this.dni = this.address = this.age = this.gender = this.phoneNumber = null;
		this.imageURL = null;
		
	}

	public String getSIP() {	
		return sip;	
	}
	public String getName() {	
		return name;	
	}
	public String getDni() {	
		return dni;		
	}
	public String getAddress() {	
		return address;		
	}
	public String getAge() {	
		return age;		
	}
	public String getGender() {	
		return gender;	
	}
	public String getPhoneNumber() {	
		return phoneNumber;		
	}		
	public String getImageURL() {
		return imageURL;
	}
	
	public void setName(String name) {	
		this.name = name;	
	}
	public void setDni(String dni) {	
		this.dni = dni;		
	}
	public void setAddress(String address) {	
		this.address = address;		
	}
	public void setAge(String age) {	
		this.age = age;		
	}	
	public void setGender(String gender) {	
		this.gender = gender;	
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;		
	}
	public void setImageURL(String url) {
		this.imageURL = url;
	}
	
	
	
}
