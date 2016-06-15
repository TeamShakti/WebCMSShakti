import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;





public class ReadJSON {

	Object obj = new Object();
	
	public Object readjson(){
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
		mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
		
		try {		
		String json = "{\n  \"Subscription\": {\n    \"Package\": [\n      {\n        \"packageID\": \"P01\",\n        \"title\": \"super gold\",\n        \"description\": \"this is super gold\",\n        \"country\": \"INDIA\",\n        \"region\": \"ALL\",\n        \"currency\": \"Rupees\",\n        \"price\": \"100\"\n      },\n      {\n        \"packageID\": \"P02\",\n        \"title\": \"premium gold\",\n        \"description\": \"this is super gold\",\n        \"country\": \"INDIA\",\n        \"region\": \"ALL\",\n        \"currency\": \"Ruppes\",\n        \"price\": \"100\"\n      },\n      {\n        \"packageID\": \"P03\",\n        \"title\": \"diamond\",\n        \"description\": \"this is super gold\",\n        \"country\": \"INDIA\",\n        \"region\": \"ALL\",\n        \"currency\": \"Ruppes\",\n        \"price\": \"100\"\n      }\n    ]\n  }\n}";	
		//String json = "{ \"OnDemand\": { \"VOD\": [ { \"vodID\": \"V05\", \"title\": \"Star plus\", \"description\": \"this is start plus tv\", \"genre\": \"Entertainment\", \"country\": \"INDIA\", \"region\": \"ALL\", \"language\": \"Hindi\", \"imageURL\": \"www.google.com\", \"vodURL\": \"www.s3.com\", \"duration\": \"60\", \"rating\": \"A\", \"credits\": { \"director\": \"Mark Steven Johnson\", \"actor\": \"Nicolas Cage\", \"writer\": \"Sam Elliott\", \"producer\": \"Calgary Stampede\" }, \"showtype\": \"event\", \"provider\": \"SONYPIX\", \"packagelist\": [ \"P05\", \"P07\", \"P08\" ] }, { \"vodID\": \"V06\", \"title\": \"Star plus\", \"description\": \"this is start plus tv\", \"genre\": \"Entertainment\", \"country\": \"INDIA\", \"region\": \"ALL\", \"language\": \"Hindi\", \"imageURL\": \"www.google.com\", \"vodURL\": \"www.s3.com\", \"duration\": \"60\", \"rating\": \"A\", \"credits\": { \"director\": \"Mark Steven Johnson\", \"actor\": \"Nicolas Cage\", \"writer\": \"Sam Elliott\", \"producer\": \"Calgary Stampede\" }, \"showtype\": \"event\", \"provider\": \"SONYPIX\", \"packagelist\": [ \"P07\", \"P06\" ] }, { \"vodID\": \"V08\", \"title\": \"Star plus\", \"description\": \"this is start plus tv\", \"genre\": \"Entertainment\", \"country\": \"INDIA\", \"region\": \"ALL\", \"language\": \"Hindi\", \"imageURL\": \"www.google.com\", \"vodURL\": \"www.s3.com\", \"duration\": \"60\", \"rating\": \"A\", \"credits\": { \"director\": \"Mark Steven Johnson\", \"actor\": \"Nicolas Cage\", \"writer\": \"Sam Elliott\", \"producer\": \"Calgary Stampede\" }, \"showtype\": \"event\", \"provider\": \"SONYPIX\", \"packagelist\": [ \"P08\", \"P09\" ] } ] } }";
		//String json = "{ \"Live\": { \"Channel\": [ { \"channelid\": \"C04\", \"title\": \"Star plus\", \"description\": \"this is start plus tv\", \"genre\": \"Entertainment\", \"country\": \"INDIA\", \"region\": \"ALL\", \"language\": \"Hindi\", \"imageURL\": \"www.google.com\", \"channelURL\": \"www.s3.com\", \"packagelist\": [ \"P04\", \"P05\", \"P06\" ] }, { \"channelid\": \"C05\", \"title\": \"Zee tv\", \"description\": \"this is start Zee tv\", \"genre\": \"Entertainment\", \"country\": \"INDIA\", \"region\": \"South\", \"language\": \"Hindi\", \"imageURL\": \"www.google.com\", \"channelURL\": \"www.s3.com\", \"packagelist\": [ \"P04\", \"P05\" ] }, { \"channelid\": \"C06\", \"title\": \"comedy central\", \"description\": \"this is start comedy central\", \"genre\": \"Comedy\", \"country\": \"INDIA\", \"region\": \"North\", \"language\": \"Hindi\", \"imageURL\": \"www.google.com\", \"channelURL\": \"www.s3.com\", \"packagelist\": [ \"P05\", \"P06\" ] } ] } }";
		//String json = "{ \"EPG\": { \"Programme\": [ { \"programID\": \"C02P01\", \"title\": \"Sunaina\", \"description\": \"This show revolves around a 15 year old girl called Sunaina and the crazy world she lives in. A dysfunctional family, a crazy set of friends, and a school where you break all the rules.\", \"start\": \"20160428000000\", \"end\": \"20160428000000\", \"genre\": \"Anime\", \"duration\": \"60\", \"country\": \"INDIA\", \"rating\": \"A\", \"credits\": { \"director\": \"Mark Steven Johnson\", \"actor\": \"Nicolas Cage\", \"writer\": \"Sam Elliott\", \"producer\": \"Calgary Stampede\" }, \"language\": \"Hindi\", \"channelid\": \"C02\" }, { \"programID\": \"C02P02\", \"title\": \"Sunaina\", \"description\": \"This show revolves around a 15 year old girl called Sunaina and the crazy world she lives in. A dysfunctional family, a crazy set of friends, and a school where you break all the rules.\", \"start\": \"20160428000000\", \"end\": \"20160428000000\", \"genre\": \"Anime\", \"duration\": \"60\", \"country\": \"INDIA\", \"rating\": \"A\", \"credits\": { \"director\": \"Mark Steven Johnson\", \"actor\": \"Nicolas Cage\", \"writer\": \"Sam Elliott\", \"producer\": \"Calgary Stampede\" }, \"language\": \"Hindi\", \"channelid\": \"C02\" } ] } }";
		JsonFactory factory = new JsonFactory();
		JsonParser parser = factory.createParser(json);
		 String fieldName = null;
		  while(!parser.isClosed()){
			  JsonToken token= parser.nextToken();
			  if(JsonToken.FIELD_NAME.equals(token)){
			  fieldName = parser.getCurrentName();
			  break;
			  }
		  }
		  try {
			Class<?> cl = Class.forName(fieldName);
			obj = mapper.readValue(json, cl);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	} catch (JsonParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return obj;
		}
	}

