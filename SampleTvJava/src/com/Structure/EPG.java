package com.Structure;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class EPG {
	ArrayList<Programme> Programme_list = new ArrayList<Programme>();
	@XmlElement
	public ArrayList<Programme> getProgramme_list() {
		return Programme_list;
	}

	public void setProgramme_list(ArrayList<Programme> programme_list) {
		Programme_list = programme_list;
	}
	
	
}
