package readDataFromJSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class readDatafromJSON {

	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jsonparser = new JSONParser();
		
		FileReader reader = new FileReader(".\\jsonFiles\\testData.json");
		
		Object obj = jsonparser.parse(reader);
		
		JSONObject testDatajson = (JSONObject)obj;
		
		String userName = (String)testDatajson.get("userId");
		String password = (String)testDatajson.get("password");
		
		System.out.println(userName);
		

	}

}
