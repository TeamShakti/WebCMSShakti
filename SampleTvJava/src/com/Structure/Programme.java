package com.Structure;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlElement;
@Entity
public class Programme {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String programID;
	private String	title;
	private String desc;
	private String start;
	private String end;
	private String genre;
	private int duration;
	private String country;
	private String rating;
	@OneToOne(cascade={CascadeType.ALL})
	private	Credits credits = new Credits();
	private String language;
	private Channel channelID;
	@XmlElement
	public String getProgramID() {
		return programID;
	}
	public void setProgramID(String programID) {
		this.programID = programID;
	}
	@XmlElement
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@XmlElement
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@XmlElement
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	@XmlElement
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	@XmlElement
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@XmlElement
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@XmlElement
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@XmlElement
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public Credits getCredits() {
		return credits;
	}
	public void setCredits(Credits credits) {
		this.credits = credits;
	}
	@XmlElement
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@XmlElement
	public Channel getChannelID() {
		return channelID;
	}
	public void setChannelID(Channel channelID) {
		this.channelID = channelID;
	}
	
	
	
}
