package cogs.elementlocators;

import cogs.pages.MainPage;
import cogs.pages.GuiPage;
import navigation.pagestructure.PageStructure;

public class PageFactory
{
    public static GuiPage getPage(PageStructure structure)
    {
        return new MainPage(structure);
    }
}
