package com.sophossolutions.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:webdriver.base.url")

public class HomePage extends PageObject{
  
    public static final Target SCROLL_TITTLE_PAGE= Target.the("Scroll Tittle Page")
    .locatedBy("//div[@class='pattern-backgound playgound-header']");  

    public static final Target SCROLL_HOME_PAGE= Target.the("Scroll Home Page")
    .locatedBy("//div[@class='card mt-4 top-card']");  

    public static final Target MENU_ELEMENTS= Target.the("Menu Elements")
    .locatedBy("//h5[contains(text(),'Elements')]");

    public static final Target OPTION_WEB_TABLES= Target.the("Option Web Tables")
    .locatedBy("//span[contains(text(),'Web Tables')]");

    public static final Target MENU_WIDGETS= Target.the("Menu Widgets")
    .locatedBy("//h5[contains(text(),'Widgets')]");

    public static final Target OPTION_DATE_PICKER= Target.the("Option Date Picker")
    .locatedBy("//span[contains(text(),'Date Picker')]");
    
    public static final Target MENU_ALERTS= Target.the("Menu Widgets")
    .locatedBy("//h5[contains(text(),'Alerts, Frame & Windows')]");

    public static final Target OPTION_ALERTS= Target.the("Option Date Picker")
    .locatedBy("//span[contains(text(),'Alerts')]");
    
}
