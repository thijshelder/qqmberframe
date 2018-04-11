package mysupersteps;


import cogs.elementlocators.PageFactory;
import cogs.elementlocators.element.GuiElement;
import cogs.pages.GuiPage;
import guiElementUtilities.InputUtility;
import navigation.pagestructure.SearchPageStructure;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class SearchSteps
{
   GuiPage page= PageFactory.getPage(new SearchPageStructure());

    public void navigateToGoogle()
    {
        page.navigateToPage("https://www.google.nl");
    }

    public void searchForTerm(String term)
    {
       List<GuiElement> elements = page.getGuiElements();
       elements.stream().forEachOrdered(e->InputUtility.createInput(e, page, term));
    }

    private URL setURl(String urlstring)
    {
        try
        {
           return new URL(urlstring);
        }
        catch(MalformedURLException e)
        {
            throw new RuntimeException("Could not parse that url");
        }
    }

}
