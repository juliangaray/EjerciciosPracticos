package com.sophossolutions.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DatePicker {
    
    public static final Target INPUT_DATE= Target.the("Input date")
    .located(By.id("datePickerMonthYearInput"));

    public static final Target INPUT_DATE_TIME= Target.the("Input date and time")
    .located(By.id("dateAndTimePickerInput"));

    public static final Target SELECT_MONTH_DATE= Target.the("Select Month date")
    .locatedBy("//select[@class='react-datepicker__month-select']");

    public static final Target SELECT_YEAR_DATE= Target.the("Select year date")
    .locatedBy("//select[@class='react-datepicker__year-select']");

    public static final Target SELECT_DAY_DATE= Target.the("Select Time")
    .locatedBy("//div[text()='{0}']");

    public static final Target SPAN_MONTH_DATE_TIME= Target.the("Span Month date Time")
    .locatedBy("//span[@class='react-datepicker__month-read-view--down-arrow']");

    public static final Target SELECT_MONTH_DATE_TIME= Target.the("Select Month date Time")
    .locatedBy("//div[@class='react-datepicker__month-option' and contains(string(),'{0}')]");

    public static final Target SPAN_YEAR_DATE_TIME= Target.the("Span year date Time")
    .locatedBy("//span[@class='react-datepicker__year-read-view--down-arrow']");

    public static final Target SELECT_YEAR_DATE_TIME= Target.the("Select year date Time")
    .locatedBy("//div[contains(number(),{0})]");

    public static final Target SELECT_TIME= Target.the("Select Time")
    .locatedBy("//li[text()='{0}']");

   

}
