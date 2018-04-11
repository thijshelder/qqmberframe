package cogs.driverTooling;

import cogs.driverTooling.frameCore.PropertyLoader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriverProvider
{
   public static WebDriver initiateDriver()
   {
       PropertyLoader.loadProperties("C:\\TestPartner\\Robert\\qqmberproj\\guicore\\config.properties");
        if (System.getProperties().getProperty("browserType").equals("chrome"))
       {
           return new ChromeDriver();
       }
       return new FirefoxDriver();
   }
}
