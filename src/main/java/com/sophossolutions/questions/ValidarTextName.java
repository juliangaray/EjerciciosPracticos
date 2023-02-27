package com.sophossolutions.questions;

import com.sophossolutions.userinterfaces.Alerts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ValidarTextName implements Question<String>{




@Override
public String answeredBy(Actor actor) {
 
    return BrowseTheWeb.as(actor).find(Alerts.TEXT_NAME).getText();
} 

public static ValidarTextName validarTextName() {
    return new ValidarTextName();
       }
}
