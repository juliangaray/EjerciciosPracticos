package com.sophossolutions.stepdefinitions;

import com.sophossolutions.tasks.date_pickers.NavegarDatePicker;
import com.sophossolutions.tasks.date_pickers.SeleccionarFecha;
import com.sophossolutions.tasks.date_pickers.SeleccionarFechaTime;
import com.sophossolutions.tasks.date_pickers.ValidarFecha;
import com.sophossolutions.tasks.date_pickers.ValidarFechaTime;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class DatePickerStepDefinitions {

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

    theActorInTheSpotlight().attemptsTo(ValidarFecha.validarFecha(archivo));
}

@When("^selecciona la fecha y hora en Date And Time$")
public void seleccionaLaFechaYHoraEnDateAndTime(DataTable table) {
    theActorInTheSpotlight().attemptsTo(SeleccionarFechaTime.seleccionarFechaTime(table));
}
@Then("^visualiza la fecha (.*) y hora seleccionada (.*)$")
public void visualizaLaFechaYHoraSeleccionada(String fecha,String horaMilitar){ 

theActorInTheSpotlight().attemptsTo(ValidarFechaTime.validarFechaTime(fecha,horaMilitar));   
}

}