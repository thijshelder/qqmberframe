package cogs.driverTooling;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SharedDriver
{

    WebDriver driver;
    private static SharedDriver instance;
    private SharedDriver()
    {
           driver = MyDriverProvider.initiateDriver();
           driver.manage().deleteAllCookies();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static SharedDriver getInstance()
    {
        if(instance==null)
        {
            return new SharedDriver();
        }
        return instance;
    }

    public WebDriver getDriver()
    {
        return driver;
    }

    public void closeDown()
    {
        driver.close();
    }


}
