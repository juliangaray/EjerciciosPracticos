package com.sophossolutions.questions.alerts;

import com.sophossolutions.userinterfaces.Alerts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class TextYourName implements Question<String>{

@Override
public String answeredBy(Actor actor) {
 
    return BrowseTheWeb.as(actor).find(Alerts.TEXT_NAME).getText();
} 

public static TextYourName validarTextName() {
    return new TextYourName();
       }
}
