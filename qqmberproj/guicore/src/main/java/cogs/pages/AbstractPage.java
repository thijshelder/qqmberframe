package cogs.pages;

import cogs.driverTooling.SharedDriver;
import cogs.elementlocators.element.GuiElement;
import cogs.exception.GuiElementException;
import navigation.pagestructure.PageStructure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class AbstractPage
{
    private static final Logger LOG = LoggerFactory.getLogger(AbstractPage.class);
    List<GuiElement> inputElements;
    SharedDriver driver = SharedDriver.getInstance();

    public AbstractPage(PageStructure structure)
    {
        inputElements = structure.getGuiElements();
    }

    public List<GuiElement> getGuiElements() {
        return inputElements;
    }

    public void navigateToPage(String url)
    {
        driver.getDriver().navigate().to(url);
    }

    public List<WebElement> getActualElements(GuiElement myElement)
{
    switch (myElement.getLocatorType()) {
        case ID:
            return driver.getDriver().findElements(By.id(myElement.getLocatorValue()));
        case NAME:
            return driver.getDriver().findElements(By.name(myElement.getLocatorValue()));
        case XPATH:
            return driver.getDriver().findElements(By.xpath(myElement.getLocatorValue()));
        default:
            throw new GuiElementException("could not find any element to interact with");
    }
}

    public void closeIt()
    {
        driver.closeDown();
    }
}
