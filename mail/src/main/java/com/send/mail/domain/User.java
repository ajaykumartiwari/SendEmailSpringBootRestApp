/**
 * 
 */
package com.send.mail.domain;

/**
 * @author ajay
 *
 */
public class User {

	private String firstName;
	private String lastName;
	private String emailAddress;
	
	public User() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return emailAddress;
	}
}