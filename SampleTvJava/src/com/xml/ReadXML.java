package com.xml;


import java.io.File;
import java.io.Serializable;

import javassist.expr.NewArray;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import org.w3c.dom.Document;


import com.Structure.OnDemand;


public class ReadXML implements Serializable {


public Object readxml(String F, Class C )
{
	Object ob =  new Object();
	try {
//		File file = new File(F);
//        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//        Document doc = dBuilder.parse(file);
//        String root = doc.getDocumentElement().getNodeName();
        //String root="OnDemand.class";
        //System.out.println(root);
        //Class cls = Class.forName(root);
       // System.out.println(cls);
		//JAXBContext jaxbContext = JAXBContext.newInstance(Class.forName(root));
		JAXBContext jaxbContext = JAXBContext.newInstance(C);
		Unmarshaller mUnmarshaller = jaxbContext.createUnmarshaller();	
		ob = mUnmarshaller.unmarshal(new File(F));
		
		//System.out.println(ob.getClass().toString());
		//System.out.println(onDemand.getVOD().get(0).getShowtype());
		//VOD vod = onDemand.getVOD().get(0);
			
			
			
			
			
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	
return ob;
}
}
