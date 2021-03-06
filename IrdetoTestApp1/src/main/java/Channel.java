
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
@XmlRootElement(name="Channel")
@JsonRootName(value="Channel")
@Entity
@Table(name="Channel")
public class Channel implements Serializable {
	@Id
	private String channelid;
	private	String	title;
	private	String description;
	private	String genre;
	private	String country;
	private	String region;
	private	String language;
	private	String imageURL;
	private	String channelURL;
	@JsonProperty(value="packagelist")
	@ElementCollection
    private	Collection<String> packagelist = new ArrayList<String>();

	@XmlAttribute
	public String getChannelid() {
		return channelid;
	}
	public void setChannelid(String channelid) {
		this.channelid = channelid;
	}
	@XmlElement
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@XmlElement
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
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
	public String getChannelURL() {
		return channelURL;
	}
	public void setChannelURL(String channelURL) {
		this.channelURL = channelURL;
	}
	@XmlElement(name="packageID")
	@JsonProperty
	public Collection<String> getPackage_list() {
		return packagelist;
	}
	@JsonProperty
	public void setPackage_list(Collection<String> package_list) {
		this.packagelist = package_list;
	}
		
}
