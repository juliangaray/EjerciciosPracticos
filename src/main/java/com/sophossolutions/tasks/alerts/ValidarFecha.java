package com.sophossolutions.tasks.alerts;

import com.sophossolutions.exceptions.GeneralException;
import com.sophossolutions.questions.FechaArchivo;
import com.sophossolutions.questions.FechaTexbox;
import com.sophossolutions.util.ErrorMessage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import static org.hamcrest.core.IsEqual.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ValidarFecha  implements Task{

    private String archivo;

    public ValidarFecha(String archivo) {
        this.archivo = archivo;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {    
    actor.should(seeThat(FechaArchivo.validarFechaArchivo(archivo),
    equalTo(FechaTexbox.validarFechaTexbox().answeredBy(actor))).orComplainWith(GeneralException.class,
    ErrorMessage.MSG_ERROR));
    }  
 
    public static ValidarFecha validarFecha(String archivo) {
        return Tasks.instrumented(ValidarFecha.class,archivo);
    }
  
}
