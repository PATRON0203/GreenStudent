package org.zerock.domain;

public class UserVO {
	String user_mail;
	String user_pw;
	String user_name;
	String user_age;
	
	public String getUser_mail() {
		return user_mail;
	}
	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_age() {
		return user_age;
	}
	public void setUser_age(String user_age) {
		this.user_age = user_age;
	}
	
	
	@Override
	public String toString() {
		return "UserDTO [user_mail=" + user_mail + ", user_pw=" + user_pw + ", user_name=" + user_name + ", user_age="
				+ user_age + "]";
	}
	
	
}
