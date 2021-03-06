package KuPortal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class EnvironmentVariables {
	
	public static String sUrl_StudentPortal=null;
	public static String sUsername_Faculty = null;
	public static String sPassword_Faculty = null;
	
	@Parameters({ "Environment" })
	@BeforeSuite
	public void BeforeSuite(String Environment)
	{
		String sPathEnvironmentfile = null;
		FileInputStream objFileInputStream = null;
		Properties propEnvironment = new Properties();
		
		if(Environment.equalsIgnoreCase("test"))
		{
			sPathEnvironmentfile = "C:\\Java Projects\\JAVA_PROJECTS\\FirstProject\\Resources\\UtilityFiles\\KUPortal_TEST_EnvVariable.properties";
		}
		
		File fileEnvironment =  new File(sPathEnvironmentfile);
		try {
				objFileInputStream = new FileInputStream(fileEnvironment);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		try {
			propEnvironment.load(objFileInputStream);
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		//Read Variables
		sUrl_StudentPortal = propEnvironment.getProperty("sUrl_StudentPortal");
		sUsername_Faculty = propEnvironment.getProperty("sUsername_Faculty");
		sPassword_Faculty = propEnvironment.getProperty("sPassword_Faculty");
		
	}

}
