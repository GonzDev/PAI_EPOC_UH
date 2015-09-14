package com.gonz.uh.model;

public class Patient {
 	
	private String sip;		// 7 digits
	private String clinicHistory;	// 6 digits
	private String name;
	private String address;
	private String age;
	private String gender;
	
	public Patient(String sip) {
		
		this.sip = sip;
		this.name = this.clinicHistory = this.address = this.age = this.gender = null;
		
	}

	public String getSIP() {	
		return sip;	
	}
	public String getName() {	
		return name;	
	}
	public String getClinicHistoy() {	
		return clinicHistory;		
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
	
	public void setName(String name) {	
		this.name = name;	
	}
	public void setClinicHistoryNumber(String n) {	
		this.clinicHistory = n;		
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
	
}
