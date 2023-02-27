package com.sophossolutions.questions;

import com.sophossolutions.userinterfaces.DatePicker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ValidarFecha implements Question<String>{   
    private String fechaTexto;
    private String fechaDate;
    
    @Override
    public String answeredBy(Actor actor) {
        fechaTexto = BrowseTheWeb.as(actor).find(DatePicker.INPUT_DATE).getValue(); 
        switch (fechaTexto.substring(0,2)) {
            case "01":
                 fechaDate="January"+fechaTexto.substring(2);
                break;
        
            case "02":
                 fechaDate="February"+fechaTexto.substring(2);
                break;

            case "03":
                 fechaDate="March"+fechaTexto.substring(2);
                 break;
            
            case "04":
                 fechaDate="April"+fechaTexto.substring(2);
                 break;

            case "05":
                 fechaDate="May"+fechaTexto.substring(2);
                 break;
             
            case "06":
                 fechaDate="June"+fechaTexto.substring(2);
                 break;
     
            case "07":
                 fechaDate="July"+fechaTexto.substring(2);
                 break;
                 
            case "08":
                 fechaDate="August"+fechaTexto.substring(2);
                 break;

            case "09":
                 fechaDate="September"+fechaTexto.substring(2);
                 break;
             
            case "10":
                 fechaDate="Octuber"+fechaTexto.substring(2);
                 break;
     
            case "11":
                 fechaDate="November"+fechaTexto.substring(2);
                 break;
                 
            case "12":
                 fechaDate="Diciembre"+fechaTexto.substring(2);
                 break;       
        } 
         return fechaDate;   

    }
    public static ValidarFecha validarFecha() {
        return new ValidarFecha();
    } 
    
}

