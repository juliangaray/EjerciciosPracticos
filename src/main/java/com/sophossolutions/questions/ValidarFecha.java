package com.sophossolutions.questions;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

import com.sophossolutions.userinterfaces.DatePicker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ValidarFecha implements Question<String>{   
    private String fechaTexto,monthName,fechaDate;
    private Month mMonth;
    private Locale locale;
    
    @Override
    public String answeredBy(Actor actor) {
        fechaTexto = BrowseTheWeb.as(actor).find(DatePicker.INPUT_DATE).getValue(); 
        locale = new Locale("en", "EN");
        mMonth=Month.of(Integer.parseInt(fechaTexto.substring(0,2)));
        monthName=mMonth.getDisplayName(TextStyle.FULL,locale);  
        fechaDate=monthName+fechaTexto.substring(2);
        return fechaDate;   

    }
    public static ValidarFecha validarFecha() {
        return new ValidarFecha();
    } 
    
}

