package Sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataDrivenFromProperties {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\harik\\OneDrive\\Documents\\TestData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty("URL");
		System.out.println(value);
		
	}

}
