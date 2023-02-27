package com.sophossolutions.questions;

import com.sophossolutions.userinterfaces.WebTables;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ValidarExistenciaRegistro implements Question<Boolean>{

    private String firtsName;

    public ValidarExistenciaRegistro(String firtsName) {
        this.firtsName = firtsName;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

          if (BrowseTheWeb.as(actor).find(WebTables.CELL_NAME.of(firtsName)).isPresent()) {
          return true; 
        } else {
          return false; 
        }
    }
    
    public static ValidarExistenciaRegistro validarExistenciaRegistro(String firtsName) {
        return new ValidarExistenciaRegistro(firtsName);
    }   
}
