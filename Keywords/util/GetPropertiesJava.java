package util;

import java.util.Properties;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Exception;

public class GetPropertiesJava {


	public static String getFileProperties(String key) throws IOException {

		String props = "Include/config/Workflow.properties";
		String url = "";

		try {

			Properties properties = new Properties();
			properties.load(new FileReader(props));
			url = properties.getProperty(key);
			System.out.println(url);

		} catch (Exception e) {

			e.getMessage();
		}

		return url;

	}
	
}
