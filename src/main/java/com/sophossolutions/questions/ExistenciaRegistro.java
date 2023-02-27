package com.sophossolutions.questions;

import com.sophossolutions.userinterfaces.WebTables;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ExistenciaRegistro implements Question<Boolean>{

    private String firtsName;

    public ExistenciaRegistro(String firtsName) {
        this.firtsName = firtsName;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

       return BrowseTheWeb.as(actor).find(WebTables.CELL_NAME.of(firtsName)).isPresent();
    }
    
    public static ExistenciaRegistro validarExistenciaRegistro(String firtsName) {
        return new ExistenciaRegistro(firtsName);
    }   
}
