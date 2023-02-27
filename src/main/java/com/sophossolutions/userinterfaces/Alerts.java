package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Alerts {

    public static final Target BUTTON= Target.the("Button")
    .locatedBy("//button[@id='{0}']");

    public static final Target TEXT_NAME= Target.the("Text Name")
    .locatedBy("//*[@id='promptResult']");
    
}
