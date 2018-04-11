package guiElementUtilities;

import cogs.elementlocators.element.GuiElement;
import cogs.pages.GuiPage;
import guiElementUtilities.guiElementInput.GuiFields;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Random;


public class InputUtility {

    public static void createInput(GuiElement element, GuiPage page)
    {
        createInput(element, page, nonsenseOMatic());
    }

    public static void createInput(GuiElement element, GuiPage page, String soloInput)
    {
        switch(element.getElementType())
        {
            case BOOLEAN:
                page.getActualElements(element).get(0).click();
                break;
            case TEXT:
                page.getActualElements(element).get(0).sendKeys(soloInput);
                page.getActualElements(element).get(0).sendKeys(Keys.TAB);
                break;
            case CLICKABLE:
                page.getActualElements(element).get(0).click();
                break;
        }
    }


    public static void createInput(GuiElement element, GuiPage page, GuiFields fields)
    {
    }

    private static WebElement getElement(GuiElement element, GuiPage page)
    {
        return page.getActualElements(element).get(0);
    }

    private static String nonsenseOMatic()
    {
        String nonsense = "";
        for(int i=0;i<new Random().nextInt(44);i++)
        {
            nonsense+=(Character.toString((char) new Random().nextInt(127)));
        }
        return nonsense;
    }

    public String tryNonsenseOMatic()
    {
        return InputUtility.nonsenseOMatic();
    }

}
