package com.xml;

import com.Structure.EPG;
import com.Structure.Live;
import com.Structure.OnDemand;

public class Execute {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReadXML R = new ReadXML();
		//OnDemand od = (OnDemand)R.readxml("VOD.xml", OnDemand.class);
//		System.out.println(od.getVOD().get(0).getShowtype());
//		WriteXMLtoDatabase wrt = new WriteXMLtoDatabase();
//		wrt.writexmltodatabase(od.getVOD().get(0));
		
		
		
		Live od = (Live)R.readxml("channels.xml", Live.class);
		System.out.println(od.getChannel_list().get(0).getCountry());
		WriteXMLtoDatabase wrt = new WriteXMLtoDatabase();
		wrt.writexmltodatabase(od.getChannel_list().get(0));
		
		
		
		/*EPG od1 = (EPG)R.readxml("EPG_C01.xml", EPG.class);
		System.out.println(od1.getProgramme_list().get(0).getCountry());
		WriteXMLtoDatabase wrt1 = new WriteXMLtoDatabase();
		wrt1.writexmltodatabase(od1.getProgramme_list().get(0));*/
	}

}
