package com.Structure;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="Live")
public class Live {
	
	private ArrayList<Channel> Channel_list = new ArrayList<Channel>();
	
public Live() {
		
	}
	
public Live(ArrayList<Channel> channels){
	this.Channel_list=channels;
}

	@XmlElement(name="Channel")
	public ArrayList<Channel> getChannel_list() {
		return Channel_list;
	}

	public void setChannel_list(ArrayList<Channel> channel_list) {
		Channel_list = channel_list;
	}

}
