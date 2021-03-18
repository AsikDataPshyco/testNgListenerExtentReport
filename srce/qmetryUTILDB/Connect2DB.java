package qmetryUTILDB;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;


import org.testng.annotations.Test;

import com.qmetry.qaf.automation.util.DatabaseUtil;
import com.qmetry.qaf.automation.util.PropertyUtil;

public class Connect2DB {
	
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
	
	public static void verifyUI2DataBaseValue() throws IOException {
				
		PropertyUtil prop = new PropertyUtil("resources/application.property");
		String sql = String.format(prop.getProperty("db.base.sql").toString(), prop.getProperty("environment"));
		List<Map<String, Object>> dbValue = DatabaseUtil.getRecordAsMap(sql);		
		String dbValue1 = dbValue.get(0).get("value").toString();
		
				
				
	}

}
