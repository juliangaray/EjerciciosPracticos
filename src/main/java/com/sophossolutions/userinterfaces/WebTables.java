package com.sophossolutions.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class WebTables {
     
    public static final Target BUTTON_ADD= Target.the("Button add Web Tables")
    .located(By.id("addNewRecordButton"));

    public static final Target TEXBOX_FIRST_NAME= Target.the("TexBox First name")
    .located(By.id("firstName"));

    public static final Target TEXBOX_LAST_NAME= Target.the("TexBox Last name")
    .located(By.id("lastName"));

    public static final Target TEXBOX_EMAIL= Target.the("TexBox Email")
    .located(By.id("userEmail"));

    public static final Target TEXBOX_AGE= Target.the("TexBox Age")
    .located(By.id("age"));

    public static final Target TEXBOX_SALARY= Target.the("TexBox Salary")
    .located(By.id("salary"));

    public static final Target TEXBOX_DEPARTMENT= Target.the("TexBox Department")
    .located(By.id("department"));

    public static final Target BUTTON_SUBMIT= Target.the("Button Submit")
    .located(By.id("submit"));

    public static final Target CELL_NAME = Target.the("Cell Firtsname")
    .locatedBy("//div[contains(text(),'{0}')]");

    public static final Target BUTTON_DELETE_RECORD = Target.the("Button Delete Record")
    .locatedBy("//span[@id='delete-record-{0}']");

}
