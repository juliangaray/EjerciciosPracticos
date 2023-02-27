package com.sophossolutions.stepdefinitions;

import com.sophossolutions.exceptions.GeneralException;
import com.sophossolutions.questions.ValidarFechaArchivo;
import com.sophossolutions.questions.ValidarFechaTexbox;
import com.sophossolutions.questions.ValidarFechaTime;
import com.sophossolutions.tasks.date_pickers.NavegarDatePicker;
import com.sophossolutions.tasks.date_pickers.SeleccionarFecha;
import com.sophossolutions.tasks.date_pickers.SeleccionarFechaTime;
import com.sophossolutions.util.ErrorMessage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class DatePickerStepDefinitions {
    private Integer hora;
    private String horaNormal;

@When("^se desplaza a la pagina de date picker$")
public void seDesplazaALaPaginaDeDatePicker() {
    theActorInTheSpotlight().wasAbleTo(NavegarDatePicker.navegar());
}
@When("^selecciona la fecha en Select Date del archivo (.*)$")
public void seleccionaLaFechaEnSelectDate(String archivo){
   
     theActorInTheSpotlight().attemptsTo(SeleccionarFecha.seleccionarFecha(archivo));
    }

@Then("^visualiza la fecha seleccionada del archivo (.*)$")
public void visualizaLaFechaSeleccionada(String archivo){

    theActorInTheSpotlight().should(seeThat(ValidarFechaArchivo.validarFechaArchivo(archivo),
    equalTo(ValidarFechaTexbox.validarFechaTexbox())).orComplainWith(GeneralException.class,
    ErrorMessage.MSG_ERROR));
}

@When("^selecciona la fecha y hora en Date And Time$")
public void seleccionaLaFechaYHoraEnDateAndTime(DataTable table) {
    theActorInTheSpotlight().attemptsTo(SeleccionarFechaTime.seleccionarFechaTime(table));
}
@Then("^visualiza la fecha (.*) y hora seleccionada (.*)$")
public void visualizaLaFechaYHoraSeleccionada(String fecha,String horamilitar) 
{  hora=Integer.parseInt(horamilitar.substring(0,2));
    if (hora>12) {
        horaNormal=fecha+" "+Integer.toString(hora-12)+horamilitar.substring(2,5)+" PM";
     
    } else {
        horaNormal=fecha+" "+Integer.toString(hora)+horamilitar.substring(2,5)+" AM";
       
    }     
    theActorInTheSpotlight().should(seeThat(ValidarFechaTime.validarFechaTime(),
    equalTo(horaNormal)).orComplainWith(GeneralException.class,
    ErrorMessage.MSG_ERROR));
}
    
}
