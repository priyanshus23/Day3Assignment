package com.robomq.day3assignment;  

public class AuthorSub {
	private int authorid;
	private String name;
	private String address;
	private String bookname;

	public AuthorSub(int authorid, String name, String address, String bookname) {
		super();
		this.authorid = authorid;
		this.name = name;
		this.address = address;
		this.bookname = bookname;
	}
	@Override
	public String toString() {
		return "_" + bookname + " Written by " + name + " Residing at address " + address + "_";
	}
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
