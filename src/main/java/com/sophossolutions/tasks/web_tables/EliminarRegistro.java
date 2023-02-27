package com.sophossolutions.tasks.web_tables;
import com.sophossolutions.userinterfaces.HomePage;
import com.sophossolutions.userinterfaces.WebTables;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class EliminarRegistro implements Task{
    String posicion;

    public EliminarRegistro(String posicion) {
    this.posicion = posicion;
}

    @Override
    public <T extends Actor> void performAs(T actor) {       
          
        actor.attemptsTo(
            Scroll.to(HomePage.SCROLL_TITTLE_PAGE),
            Click.on(WebTables.BUTTON_DELETE_RECORD.of(posicion))
        );        
    }
    
    public static EliminarRegistro eliminarRegistro(String posicion) {
        return Tasks.instrumented(EliminarRegistro.class,posicion);
    } 
}
