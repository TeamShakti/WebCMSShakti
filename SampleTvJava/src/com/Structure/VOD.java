package com.Structure;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;

import javax.persistence.*;

import org.hibernate.annotations.GeneratorType;





@XmlRootElement
@Entity
@Table(name="VOD")
public class VOD implements Serializable {
	@Id
	//@Column(name="vodID")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private	int vodID;
	@Column(name="title")
	private	String	title;
	@Column(name="description")
	private	String description;
	@Column(name="genre")
	private	String genre;
	@Column(name="country")
	private	String country;
	@Column(name="region")
	private	String region;
	@Column(name="language")
	private	String language;
	@Column(name="imageURL")
	private	String imageURL;
	@Column(name="vodURL")
	private	String vodURL;
	@Column(name="duration")
	private	int duration;
	@Column(name="rating")
	private	String rating;
	@OneToOne(cascade={CascadeType.ALL})
	private	Credits credits = new Credits();
	private	String showtype;
	private	String provider;
	@ElementCollection
	private	Collection<String> package_list = new ArrayList<String>();

public VOD(){
		
		
	}
	
	public VOD(int id, String title){
		this.vodID=id;
		//this.title=title;
		
	}
	@XmlAttribute
	public int getVodID() {
		return vodID;
	}
	public void setVodID(int vodID) {
		this.vodID = vodID;
	}
	@XmlElement
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@XmlElement
	public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	@XmlElement
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@XmlElement
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@XmlElement
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@XmlElement
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@XmlElement
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	@XmlElement
	public String getVodURL() {
		return vodURL;
	}
	public void setVodURL(String vodURL) {
		this.vodURL = vodURL;
	}
	@XmlElement
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@XmlElement
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	@XmlElement
	public Credits getCredits() {
		return credits;
	}
	public void setCredits(Credits credits) {
		this.credits = credits;
	}
	@XmlElement
	public String getShowtype() {
		return showtype;
	}
	public void setShowtype(String showtype) {
		this.showtype = showtype;
	}
	@XmlElement
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	@XmlElement(name="packageID")
	public Collection<String> getPackage_list() {
		return package_list;
	}
	public void setPackage_list(ArrayList<String> package_list) {
		this.package_list = package_list;
	}
}
