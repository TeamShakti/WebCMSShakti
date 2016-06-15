import java.awt.im.InputContext;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

import javassist.expr.NewArray;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import org.w3c.dom.Document;





public class ReadXML implements Serializable {


public Object readxml()
{
	Object ob = new Object();
	try {
		//String string = "<?xml version=\"1.0\" encoding=\"UTF-8\"?> <OnDemand> <VOD vodID=\"V01\"> <title>Star plus</title> <description>this is start plus tv</description> <genre>Entertainment</genre> <country>INDIA</country> <region>ALL</region> <language>Hindi</language> <imageURL>www.google.com</imageURL> <vodURL>www.s3.com</vodURL> <duration>60</duration> <rating>A</rating> <credits> <director>Mark Steven Johnson</director> <actor>Nicolas Cage</actor> <writer>Sam Elliott</writer> <producer>Calgary Stampede</producer> </credits> <showtype>event</showtype> <provider>SONYPIX</provider> <packagelist>P01</packagelist> <packagelist>P02</packagelist> <packagelist>P03</packagelist> </VOD> <VOD vodID=\"V02\"> <title>Star plus</title> <description>this is start plus tv</description> <genre>Entertainment</genre> <country>INDIA</country> <region>ALL</region> <language>Hindi</language> <imageURL>www.google.com</imageURL> <vodURL>www.s3.com</vodURL> <duration>60</duration> <rating>A</rating> <credits> <director>Mark Steven Johnson</director> <actor>Nicolas Cage</actor> <writer>Sam Elliott</writer> <producer>Calgary Stampede</producer> </credits> <showtype>event</showtype> <provider>SONYPIX</provider> <packagelist>P02</packagelist> <packagelist>P03</packagelist> </VOD> <VOD vodID=\"V03\"> <title>Star plus</title> <description>this is start plus tv</description> <genre>Entertainment</genre> <country>INDIA</country> <region>ALL</region> <language>Hindi</language> <imageURL>www.google.com</imageURL> <vodURL>www.s3.com</vodURL> <duration>60</duration> <rating>A</rating> <credits> <director>Mark Steven Johnson</director> <actor>Nicolas Cage</actor> <writer>Sam Elliott</writer> <producer>Calgary Stampede</producer> </credits> <showtype>event</showtype> <provider>SONYPIX</provider> <packagelist>P01</packagelist> <packagelist>P03</packagelist> </VOD> </OnDemand> ";
		//String string = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Subscription><package packageID=\"P05\"><title>super gold</title><desc>this is super gold</desc><country>INDIA</country><region>ALL</region><currency>Ruppes</currency><price>100</price></package></Subscription>";
		String string ="<?xml version=\"1.0\" encoding=\"UTF-8\"?> <Live> <Channel channelid = \"C01\"> <title>Star plus</title> <description>this is start plus tv</description> <genre>Entertainment</genre> <country>INDIA</country> <region>ALL</region> <language>Hindi</language> <imageURL>www.google.com</imageURL> <channelURL>www.s3.com</channelURL> <packagelist>P01</packagelist> <packagelist>P02</packagelist> <packagelist>P03</packagelist> </Channel> <Channel channelid = \"C02\"> <title>Zee tv</title> <description>this is start Zee tv</description> <genre>Entertainment</genre> <country>INDIA</country> <region>South</region> <language>Hindi</language> <imageURL>www.google.com</imageURL> <channelURL>www.s3.com</channelURL> <packagelist>P02</packagelist> <packagelist>P03</packagelist> </Channel> <Channel channelid = \"C03\"> <title>comedy central</title> <description>this is start comedy central</description> <genre>Comedy</genre> <country>INDIA</country> <region>North</region> <language>Hindi</language> <imageURL>www.google.com</imageURL> <channelURL>www.s3.com</channelURL> <packagelist>P02</packagelist> <packagelist>P03</packagelist> </Channel> </Live> ";
		//String string ="<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <EPG> <Programme programID=\"C02P01\"> <title>Sunaina</title> <description>This show revolves around a 15 year old girl called Sunaina and the crazy world she lives in. A dysfunctional family, a crazy set of friends, and a school where you break all the rules.</description> <start>20160428000000</start> <end>20160428000000</end> <genre>Anime</genre> <duration>60</duration> <country>INDIA</country> <rating>A</rating> <credits> <director>Mark Steven Johnson</director> <actor>Nicolas Cage</actor> <writer>Sam Elliott</writer> <producer>Calgary Stampede</producer> </credits> <language>Hindi</language> <channelid>C02</channelid> </Programme> <Programme programID=\"C02P02\"> <title>Sunaina</title> <description>This show revolves around a 15 year old girl called Sunaina and the crazy world she lives in. A dysfunctional family, a crazy set of friends, and a school where you break all the rules.</description> <start>20160428000000</start> <end>20160428000000</end> <genre>Anime</genre> <duration>60</duration> <country>INDIA</country> <rating>A</rating> <credits> <director>Mark Steven Johnson</director> <actor>Nicolas Cage</actor> <writer>Sam Elliott</writer> <producer>Calgary Stampede</producer> </credits> <language>Hindi</language> <channelid>C02</channelid> </Programme> </EPG> ";
		InputStream iStream = new ByteArrayInputStream(string.getBytes());
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new ByteArrayInputStream(string.getBytes()));
        String root = doc.getDocumentElement().getNodeName();
       Class cl = Class.forName(root);
		JAXBContext jaxbContext = JAXBContext.newInstance(cl);
		Unmarshaller mUnmarshaller = jaxbContext.createUnmarshaller();	
		ob=mUnmarshaller.unmarshal(iStream);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	
return ob;
}
}
