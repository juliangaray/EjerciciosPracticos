package com.sophossolutions.tasks.web_tables;

import com.sophossolutions.exceptions.GeneralException;
import com.sophossolutions.questions.web_tables.ExistenciaRegistro;
import com.sophossolutions.util.ErrorMessage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ValidarRegistro implements Task{

    private String firtsName, status;

    public ValidarRegistro(String status, String firtsName) {
        this.firtsName = firtsName;
        this.status = status;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(status=="creado"){
            actor.should(seeThat(ExistenciaRegistro.validarExistenciaRegistro(firtsName),
            equalTo(true)).orComplainWith(GeneralException.class,
            ErrorMessage.MSG_ERROR));
            }
            else{
            actor.should(seeThat(ExistenciaRegistro.validarExistenciaRegistro(firtsName),
            equalTo(false)).orComplainWith(GeneralException.class,
            ErrorMessage.MSG_ERROR));

            }
    } 

    public static ValidarRegistro validarRegistro(String status, String firtsName) {
        return Tasks.instrumented(ValidarRegistro.class,firtsName,status);
    }
       
}
