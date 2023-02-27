package com.sophossolutions.tasks.web_tables;

import com.sophossolutions.exceptions.GeneralException;
import com.sophossolutions.questions.web_tables.ExistenciaRegistro;
import com.sophossolutions.util.ErrorMessage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ValidarRegistroCreado implements Task{
    private String firtsName;

    public ValidarRegistroCreado(String firtsName) {
        this.firtsName = firtsName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat(ExistenciaRegistro.validarExistenciaRegistro(firtsName),
        equalTo(true)).orComplainWith(GeneralException.class,
       ErrorMessage.MSG_ERROR));
    }    

    public static ValidarRegistroCreado validarRegistroCreado(String firtsName) {
        return Tasks.instrumented(ValidarRegistroCreado.class,firtsName);
    }

}
