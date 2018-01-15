package com.eBay.DataClasses;


import net.java.amateras.xlsbeans.annotation.Column;

public class User {
	
	@Column(columnName="USERFIRSTNAME")
	public String firstName;
	
	@Column(columnName="USERLASTNAME")
	public String lastName;
	
	@Column(columnName="USERPASSWORD")
	public String userPassword;
	
	@Column(columnName="USEREMAIL")
	public String userEmail;
	
	@Column(columnName="USERADDRESS1")
	public String userAddr1;
	
	@Column(columnName="USERADDRESS2")
	public String userAddr2;
	
	@Column(columnName="USERCITY")
	public String userCity;
	
	@Column(columnName="USERSTATE")
	public String userState;
	
	@Column(columnName="USERPOSTCODE")
	public String userPostCode;
	
	@Column(columnName="USERPHONENUM")
	public String userPhoneNum;
	
	
	/*public String getUserName() {
		return userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}*/
	
	
	
}
