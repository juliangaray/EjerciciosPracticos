package com.sophossolutions.tasks.web_tables;

import com.sophossolutions.exceptions.GeneralException;
import com.sophossolutions.questions.web_tables.ExistenciaRegistro;
import com.sophossolutions.util.ErrorMessage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ValidarRegistroEliminado implements Task{

    private String firtsName;

    public ValidarRegistroEliminado(String firtsName) {
        this.firtsName = firtsName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.should(seeThat(ExistenciaRegistro.validarExistenciaRegistro(firtsName),
            equalTo(false)).orComplainWith(GeneralException.class,
            ErrorMessage.MSG_ERROR));
    } 

    public static ValidarRegistroEliminado validarRegistroEliminado(String firtsName) {
        return Tasks.instrumented(ValidarRegistroEliminado.class,firtsName);
    }
       
}
