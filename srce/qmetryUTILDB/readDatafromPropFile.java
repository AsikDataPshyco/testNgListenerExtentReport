package qmetryUTILDB;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readDatafromPropFile {

	public static void main(String[] args) throws IOException {
		
		Properties newProp = readPropFile("resources/application.property");
		
		System.out.println(newProp.getProperty("baseURl"));
		System.out.println(newProp.getProperty("userId"));
		System.out.println(newProp.getProperty("password"));
		
	}

	public static Properties readPropFile(String fileName) throws IOException {

		FileInputStream fis = null;
		Properties prop = null;

		try {

			fis = new FileInputStream(fileName);
			prop = new Properties();

			prop.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		catch (IOException ex) {
			ex.printStackTrace();
		}	finally {
        fis.close();
		}
		return prop;
	}
}
