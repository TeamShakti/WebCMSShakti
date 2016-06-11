

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class WriteXMLtoDatabase 
{
	
	public void writexmltodatabase(SessionFactory sFactory,Object o){
		
	
		////SessionFactory sFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s  = sFactory.openSession();
		Transaction transaction  = s.beginTransaction();
		s.save(o);
		transaction.commit();
		s.close();
		
		
	}
}
