
package com.mvc.bean;

public class RegisterBean {
	private String fullname;
	private String email;
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
		System.out.println(fullname + "5");
	}

	public String getFullname() {
		return fullname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
}