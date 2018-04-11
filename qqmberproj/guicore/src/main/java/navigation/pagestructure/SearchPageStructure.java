package navigation.pagestructure;

import cogs.elementlocators.element.GuiElement;

import java.util.ArrayList;
import java.util.List;

public class SearchPageStructure implements PageStructure {

        String pageName = "google";
        List<GuiElement> guiElements = new ArrayList<>();

        public SearchPageStructure()
        {
            addGuiElements();
        }

        public void addGuiElements()
        {
            guiElements.add(GuiElement.byName("SearchField","q",GuiElement.GuiElementType.TEXT));
            guiElements.add(GuiElement.byName("SearchSubmitButton", "btnK",GuiElement.GuiElementType.CLICKABLE));
        }

        public List<GuiElement> getGuiElements()
        {
            return guiElements;
        }
 }
