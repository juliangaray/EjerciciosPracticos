package com.sophossolutions.questions;
import com.sophossolutions.userinterfaces.DatePicker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ValidarFechaTime implements Question<String>{

    @Override
    public String answeredBy(Actor actor) {

        return BrowseTheWeb.as(actor).find(DatePicker.INPUT_DATE_TIME).getValue();
    }

    public static ValidarFechaTime validarFechaTime() {
        return new ValidarFechaTime();
    }     
}
