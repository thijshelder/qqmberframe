package navigation.pagestructure;

import cogs.elementlocators.element.GuiElement;
import cogs.elementlocators.element.GuiElement.GuiElementType;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * pages  are simple data structures containing elements we want to interact with
 */
public class LoginPageStructure implements PageStructure
{
    String pageName = "facebook";
    List<GuiElement> guiElements = new ArrayList<>();

    public LoginPageStructure()
    {
        addGuiElements();
    }

    public void addGuiElements()
    {
        guiElements.add(GuiElement.byName("loginNameField","email",GuiElementType.TEXT));
        guiElements.add(GuiElement.byName( "loginPasswordField", "pass", GuiElementType.TEXT));
        guiElements.add(GuiElement.byId("submitButton","loginbutton", GuiElementType.CLICKABLE));
    }

    public List<GuiElement> getGuiElements()
    {
        return guiElements;

    }
}
