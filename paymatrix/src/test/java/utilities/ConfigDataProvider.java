package utilities;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	public Properties prop;

	public ConfigDataProvider(String configdatapath) {
		try {
			File fs = new File(configdatapath);
			FileInputStream fins = new FileInputStream(fs);
			prop = new Properties();
			prop.load(fins);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("If file not found :" + e);
		}
	}


	public String getuserid() {
		return prop.getProperty("userid");

	}
	
	public String getpassword() {
		return prop.getProperty("password");

	}


	public String getURL() {
		return prop.getProperty("url");

	}
}
