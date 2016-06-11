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
@XmlRootElement(name="OnDemand")
@JsonRootName(value="OnDemand")
public class OnDemand {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int id;
	@OneToMany(cascade=CascadeType.ALL)
	private Collection<VOD> vods = new ArrayList<VOD>();
	public OnDemand() {
		
	}
	
	public OnDemand(ArrayList<VOD> vods){
		this.vods=vods;
	}
	
	@XmlElement(name="VOD")
	@JsonProperty(value="VOD")
	public Collection<VOD> getVOD() {
		return vods;
	}
	@JsonProperty(value="VOD")
	public void setVOD(Collection<VOD> vOD_list) {
		vods = vOD_list;
	}
	
	
	
}
