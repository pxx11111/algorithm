package cn.lab.datasource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesConfig {
    private static Properties prop = new Properties();
    
    static{
    	InputStream is = Properties.class.getResourceAsStream("/dbcpconfig.properties");
    	
    	try {
			prop.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public String getPropertiesValue(String propertiesKey){
    	return prop.getProperty(propertiesKey);
    }
}
