package com.Structure;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;

public class User {
	private String userID;
	private String name;
	private Collection<address> addrss = new ArrayList<address>();
	private Package package_id;
	
	@XmlElement
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public Collection<address> getAddrss() {
		return addrss;
	}
	public void setAddrss(Collection<address> addrss) {
		this.addrss = addrss;
	}
	@XmlElement
	public Package getPackage_id() {
		return package_id;
	}
	public void setPackage_id(Package package_id) {
		this.package_id = package_id;
	}
	
	
	
}
