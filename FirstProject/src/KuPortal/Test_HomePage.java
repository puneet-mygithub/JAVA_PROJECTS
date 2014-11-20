package KuPortal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import commonfunctions.ReportExtn;
import commonfunctions.UserExtension;

import UIMapKuPortal.HomePage;
import UIMapKuPortal.LandingPage;


import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

public class Test_HomePage {

public WebDriver driver = new FirefoxDriver();


@BeforeClass
public void LoginToKuPortal(){

	driver.get(EnvironmentVariables.sUrl_StudentPortal);
	LandingPage.LoginToKuPortal(driver, EnvironmentVariables.sUsername_Faculty, EnvironmentVariables.sPassword_Faculty);
}

@BeforeMethod
public void BeforeMethod(Method method)
{
	ReportExtn.MethodReportingLayout(method.getName());
	
}

@AfterClass
public void AfterClass()
{
	if(driver != null)
	{
		driver.quit();
	}
}

  
  @Test(groups = {"Grp_Navigation"})
  	  public void CheckMyStudies() {	  

	  Assert.assertTrue(UserExtension.IsElementPresent(driver, By.linkText(HomePage.linkMYSTUDIES)), "My Studies link is not present");
	 ReportExtn.Pass("MY Studies is Present");	  
  }
	  @Test(groups = {"Grp_Navigation"})
	  public void CheckHome() {	 
		  Assert.assertTrue(UserExtension.IsElementPresent(driver, By.linkText(HomePage.linkHOME)), "linkHOME is not present");
		 ReportExtn.Pass("linkHOME is Present");		 
  }
	  @Test(groups = {"Grp_Navigation"})
	  public void CheckMyAccount() {	 
		  Assert.assertTrue(UserExtension.IsElementPresent(driver, By.linkText(HomePage.linkMYACCOUNT)), "linkMYACCOUNT is not present");
		 ReportExtn.Pass("linkMYACCOUNT is Present");		  
  }
	  @Test(groups = {"Grp_Navigation"})
	  public void CheckMyTools() {	 
		  Assert.assertTrue(UserExtension.IsElementPresent(driver, By.linkText(HomePage.linkMYTOOLS)), "linkMYTOOLS is not present");
		 ReportExtn.Pass("linkMYTOOLS is Present");		  		  		  
  }
	  @Test(groups = {"Grp_Navigation"})
	  public void CheckeUniversityInfo() {	 
		  Assert.assertTrue(UserExtension.IsElementPresent(driver, By.linkText(HomePage.linkUNIVERSITYINFO)), "linkUNIVERSITYINFO is not present");
		 ReportExtn.Pass("linkUNIVERSITYINFO is Present");			  		  
  }
	  @Test(groups = {"Grp_Navigation"})
	  public void CheckUniversityCatalog() {
		  Assert.assertTrue(UserExtension.IsElementPresent(driver, By.linkText(HomePage.linkUNIVERSITYCATALOG)), "linkUNIVERSITYCATALOG is not present");
		 ReportExtn.Pass("linkUNIVERSITYCATALOG is Present");	
  }
	  @Test(groups = {"Grp_Navigation"})
	  public void CheckCommunityCenter() {	 
		  Assert.assertTrue(UserExtension.IsElementPresent(driver, By.linkText(HomePage.linkCOMMUNITYCENTER)), "linkCOMMUNITYCENTER is not present");
		 ReportExtn.Pass("linkCOMMUNITYCENTER is Present");	
  }
	  @Test(groups = {"Grp_Navigation"})
	  public void CheckCareerNetwork() {	 
		  Assert.assertTrue(UserExtension.IsElementPresent(driver, By.linkText(HomePage.linkCAREERNETWORK)), "linkCAREERNETWORK is not present");
		 ReportExtn.Pass("linkCAREERNETWORK is Present");	
  }  
	  
};
