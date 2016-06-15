import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;

public class Execute {

	/**
	 * @param args
	 */

	
	public static void main(String[] args) {

	//SessionFactory sFactory= sessionobject.sessionFactoryObject();
	WriteXMLtoDatabase wrt = new WriteXMLtoDatabase();
	
//		ReadXML R = new ReadXML();
//		Object object =R.readxml();
//		wrt.writexmltodatabase(sFactory,object);
		
		
		ReadJSON rdj = new ReadJSON();
		Object srb = (Object)rdj.readjson();
		wrt.writexmltodatabase(sessionobject.sessionFactoryObject(),srb);
		
		
//		
		
		//OnDemand od = (OnDemand)R.readxml("VOD.xml", OnDemand.class);
//		System.out.println(od.getVOD().get(0).getShowtype());
//		WriteXMLtoDatabase wrt = new WriteXMLtoDatabase();
//		wrt.writexmltodatabase(od.getVOD().get(0));
		//System.out.println(ob1.getChannel_list().get(0).getCountry());
		/*WriteXMLtoDatabase wrt = new WriteXMLtoDatabase();
		wrt.writexmltodatabase(od.getChannel_list().get(0));*/
		/*EPG od1 = (EPG)R.readxml("EPG_C01.xml", EPG.class);
		System.out.println(od1.getProgramme_list().get(0).getCountry());
		WriteXMLtoDatabase wrt1 = new WriteXMLtoDatabase();
		wrt1.writexmltodatabase(od1.getProgramme_list().get(0));*/
	}

}
