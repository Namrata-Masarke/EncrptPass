package com.example.EncrptPass.model;

public class Credential {
	private String username;
	private String service;
	private String encryptedPassword;
	
	
	
	public Credential(String username, String service, String encryptedPassword) {
		super();
		this.username = username;
		this.service = service;
		this.encryptedPassword = encryptedPassword;
	}
	
	// default Contructor
	public Credential() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	
}
