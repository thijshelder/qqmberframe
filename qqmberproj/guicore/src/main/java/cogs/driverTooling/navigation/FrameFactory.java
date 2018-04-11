package cogs.driverTooling.navigation;

import cogs.driverTooling.SharedDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByAll;

import java.util.List;

public class FrameFactory
{
    public List<WebElement> getFrameLikeElements()
    {
        return SharedDriver.getInstance().getDriver().findElements( new ByAll(By.xpath("//frame"), By.xpath("//iframe")));
    }
}
