package cogs.pages;

import cogs.elementlocators.element.GuiElement;
import navigation.pagestructure.PageStructure;
import org.openqa.selenium.WebElement;

import java.util.List;

public interface GuiPage
{
    void navigateToPage(String url);

    List<GuiElement> getGuiElements();

    List<WebElement> getActualElements(GuiElement element);

    void closeIt();
}
