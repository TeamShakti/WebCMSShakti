package com.Structure;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import javax.persistence.*;
@Entity
@XmlRootElement(name="OnDemand")

public class OnDemand {
	
	
	@Id
	private int id;
	private ArrayList<VOD> vods = new ArrayList<VOD>();
	public OnDemand() {
		
	}
	
	public OnDemand(ArrayList<VOD> vods){
		this.vods=vods;
	}
	
	@XmlElement(name="VOD")
	public ArrayList<VOD> getVOD() {
		return vods;
	}

	public void setVOD(ArrayList<VOD> vOD_list) {
		vods = vOD_list;
	}
	
	
	
}
