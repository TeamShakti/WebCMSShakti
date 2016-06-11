package com.Structure;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Subscription {
	private ArrayList<Package> Package_list= new ArrayList<Package>();
	@XmlElement
	public ArrayList<Package> getPackage_list() {
		return Package_list;
	}

	public void setPackage_list(ArrayList<Package> package_list) {
		Package_list = package_list;
	}
	
	
	
}
