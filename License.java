package com.xworkz.jdbcUsingArrayList;

public class License {
 private int dl_id;
 private String name;
 private String address;
 
 public License(int dl_id, String name, String address) {
		super();
		this.dl_id = dl_id;
		this.name = name;
		this.address = address;
	}
 
 

public int getDl_id() {
	return dl_id;
}
public void setDl_id(int dl_id) {
	this.dl_id = dl_id;
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

@Override
public String toString() {
	return "License [dl_id=" + dl_id + ", name=" + name + ", address=" + address + "]";
}
}
