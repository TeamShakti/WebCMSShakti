
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
@XmlRootElement(name="Subscription")
@JsonRootName(value="Subscription")
public class Subscription {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	//@Column(columnDefinition = "LONGBLOB",name="Package_list")
	@OneToMany(cascade=CascadeType.ALL)
	private Collection<Package> Package_list= new ArrayList<Package>();
	
	public Subscription(){}
	public Subscription(ArrayList<Package> package_list){
		this.Package_list=package_list;
	}
	@XmlElement(name="package")
	@JsonProperty(value="Package")
	public Collection<Package> getPackage_list() {
		return Package_list;
	}
	@JsonProperty(value="Package")
	public void setPackage_list(Collection<Package> package_list) {
		Package_list = package_list;
	}
	
	
	
}
