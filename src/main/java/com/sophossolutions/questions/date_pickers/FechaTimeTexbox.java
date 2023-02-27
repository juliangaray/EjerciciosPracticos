package com.sophossolutions.questions.date_pickers;
import com.sophossolutions.userinterfaces.DatePicker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class FechaTimeTexbox implements Question<String>{

    @Override
    public String answeredBy(Actor actor) {

        return BrowseTheWeb.as(actor).find(DatePicker.INPUT_DATE_TIME).getValue();
    }

    public static FechaTimeTexbox validarFechaTime() {
        return new FechaTimeTexbox();
    }     
}
