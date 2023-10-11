package commonUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	
	public Properties prop = new Properties();
	
	
	public Object propertiesdata(String path,String key) throws IOException
	{
		File f = new File(path);
		FileInputStream fis  = new FileInputStream(f);
		prop.load(fis);
		return prop.get(key);
	}

}
