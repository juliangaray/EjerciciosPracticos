package com.sophossolutions.tasks.alerts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import com.sophossolutions.exceptions.GeneralException;
import com.sophossolutions.questions.alerts.TextYourName;
import com.sophossolutions.util.ErrorMessage;
import static org.hamcrest.core.IsEqual.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class VisualizarTexto implements Task{
private String name;

    public VisualizarTexto(String name) {
    this.name = name;
}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat(TextYourName.validarTextName(),
        equalTo(name)).orComplainWith(GeneralException.class,
       ErrorMessage.MSG_ERROR));
    }  

    public static VisualizarTexto visualizarTexto(String name) {
        return Tasks.instrumented(VisualizarTexto.class,name);
    }

     
}
