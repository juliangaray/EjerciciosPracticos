package com.sophossolutions.tasks.date_pickers;

import com.sophossolutions.exceptions.GeneralException;
import com.sophossolutions.util.ErrorMessage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import static org.hamcrest.core.IsEqual.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import com.sophossolutions.questions.date_pickers.FechaTimeTexbox;

public class ValidarFechaTime implements Task{
private String fecha,horaMilitar;
private Integer hora;
private String horaNormal;

    public ValidarFechaTime(String fecha, String horaMilitar) {
    this.fecha = fecha;
    this.horaMilitar = horaMilitar;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        {  hora=Integer.parseInt(horaMilitar.substring(0,2));
            if (hora>12) {
                horaNormal=fecha+" "+Integer.toString(hora-12)+horaMilitar.substring(2,5)+" PM";
             
            } else {
                horaNormal=fecha+" "+Integer.toString(hora)+horaMilitar.substring(2,5)+" AM";
               
            }     
            actor.should(seeThat(FechaTimeTexbox.validarFechaTime(),
            equalTo(horaNormal)).orComplainWith(GeneralException.class,
            ErrorMessage.MSG_ERROR));
        }
    }
    public static ValidarFechaTime validarFechaTime(String fecha,String horaMilitar) {
        return Tasks.instrumented(ValidarFechaTime.class,fecha,horaMilitar);
    }   
}
