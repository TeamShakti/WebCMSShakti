import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class sessionobject {
	
	public static SessionFactory sfactory;
	private sessionobject(){
		
	}
	public static synchronized SessionFactory sessionFactoryObject(){
		if(sfactory==null){
			sfactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sfactory;
	}
}
