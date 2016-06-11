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
@XmlRootElement(name="EPG")
@JsonRootName(value="EPG")
public class EPG {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int id;
	@OneToMany(cascade=CascadeType.ALL)
	private Collection<Programme> Programme_list = new ArrayList<Programme>();
	public EPG(){
		
	}
	
	public EPG(ArrayList<Programme> programme){
		
		this.Programme_list=programme;
	}
	@XmlElement(name="Programme")
	@JsonProperty(value="Programme")
	public Collection<Programme> getProgramme_list() {
		return Programme_list;
	}
	@JsonProperty(value="Programme")
	public void setProgramme_list(Collection<Programme> programme_list) {
		Programme_list = programme_list;
	}
	
	
}
