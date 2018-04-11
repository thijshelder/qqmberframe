package cogs.elementlocators.element;

public class GuiElement {

    LocatorType type;
    String locatorValue;
    GuiElementType elementType;
    String name;

    private GuiElement( String name, LocatorType type, String locatorValue, GuiElementType guiElementType)
    {
        this.name = name;
        this.locatorValue = locatorValue;
        this.type = type;
        this.elementType =guiElementType;
    }

    public void interact(String[] arguments)
    {
       //TODO not quite sure about this.
        // ActionFactory.getGuiAction(this);
   }

    public GuiElementType getElementType()
    {
        return elementType;
    }

    public LocatorType getLocatorType() {
        return type;
    }

    public enum LocatorType
    {
        ID, XPATH, NAME, LABEL
    }

    public enum GuiElementType
    {
        BOOLEAN,TEXT,CLICKABLE
    }

    public String getLocatorValue()
    {
        return locatorValue;
    }

    public static GuiElement byId(String name ,String locatorValue, GuiElementType elementType)
    {
        return new GuiElement(name, LocatorType.ID,locatorValue, elementType);

    }

    public static GuiElement byName(String name, String locatorValue, GuiElementType elementType)
    {
        return new GuiElement(name, LocatorType.NAME,locatorValue, elementType);
    }

    public static GuiElement byXpath(String name, String locatorValue, GuiElementType elementType)
    {
        return new GuiElement(name, LocatorType.XPATH,locatorValue, elementType);
    }

    public static GuiElement byLabel(String name, String locatorValue, GuiElementType elementType)
    {
        return new GuiElement(name, LocatorType.LABEL, locatorValue,elementType);
    }

}
