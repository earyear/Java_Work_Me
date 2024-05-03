package util.dto;

import java.util.HashMap;

public class Person {
	
	private String name;
	private String phoneNum;
	private String date;
//	private HashMap<String, String> phoneNumList;
	
	
	public Person(String name, String phoneNum, String date /*, HashMap<String, String> phoneNumList*/) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.date = date;
//		this.phoneNumList = phoneNumList;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
//	public HashMap<String, String> getPhoneNumList() {
//		return phoneNumList;
//	}
//	public void setPhoneNumList(HashMap<String, String> phoneNumList) {
//		this.phoneNumList = phoneNumList;
//	}
	
	
	
}
