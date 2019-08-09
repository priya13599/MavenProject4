package com.nucleus.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
private int stdId;
private String sname;
@Qualifier("adr1")
@Autowired
private Address address;
public int getStdId() {
	return stdId;
}
public void setStdId(int stdId) {
	this.stdId = stdId;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public Address getAddress() {
	return address;
}
/*public void setAddress(Address address) {
	this.address = address;
}*/

}
