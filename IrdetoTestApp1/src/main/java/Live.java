import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
@Entity
@XmlRootElement(name="Live")
@JsonRootName(value="Live")
public class Live {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	@OneToMany(cascade=CascadeType.ALL)
	private Collection<Channel> Channel_list = new ArrayList<Channel>();
	
public Live() {
		
	}
	
public Live(ArrayList<Channel> channels){
	this.Channel_list=channels;
}

@XmlElement(name="Channel")
@JsonProperty(value="Channel")
	public Collection<Channel> getChannel_list() {
		return Channel_list;
	}

	public void setChannel_list(Collection<Channel> channel_list) {
		Channel_list = channel_list;
	}

}
