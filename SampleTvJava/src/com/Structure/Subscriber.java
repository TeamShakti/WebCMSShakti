package com.Structure;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Subscriber {
	
	private ArrayList<User> User_list=new ArrayList<User>();
	@XmlElement
	public ArrayList<User> getUser_list() {
		return User_list;
	}

	public void setUser_list(ArrayList<User> user_list) {
		User_list = user_list;
	}
	
	
}
