package com.sip.ams.entities;

public class Provider {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public Provider(String name, String adress, String email) {
		super();
		this.name = name;
		this.adress = adress;
		this.email = email;
	}
	public Provider() {
		super();
		
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String adress;
	private String email;
	
}
