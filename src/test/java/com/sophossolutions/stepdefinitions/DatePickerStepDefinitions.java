package com.sophossolutions.stepdefinitions;

import com.sophossolutions.exceptions.GeneralException;
import com.sophossolutions.questions.ValidarFecha;
import com.sophossolutions.questions.ValidarFechaTime;
import com.sophossolutions.tasks.date_pickers.NavegarDatePicker;
import com.sophossolutions.tasks.date_pickers.SeleccionarFecha;
import com.sophossolutions.tasks.date_pickers.SeleccionarFechaTime;
import com.sophossolutions.util.CsvParser;
import com.sophossolutions.util.ErrorMessage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;
import java.util.List;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class DatePickerStepDefinitions {
private String horaNormal,fechaArchivo;
private List<List<String>> datos;
private Integer hora;

@When("^se desplaza a la pagina de date picker$")
public void seDesplazaALaPaginaDeDatePicker() {
    theActorInTheSpotlight().wasAbleTo(NavegarDatePicker.navegar());
}
@When("^selecciona la fecha en Select Date del archivo (.*)$")
public void seleccionaLaFechaEnSelectDate(String archivo) throws IOException {
   
        datos = CsvParser.readCSVFile(
        "src/test/resources/files/"+archivo.toString()+"");
        for (List<String> row : datos){
        theActorInTheSpotlight().wasAbleTo(
        SeleccionarFecha.seleccionarFecha(row.get(0), row.get(1),row.get(2))       
      );
}
}
@Then("^visualiza la fecha seleccionada del archivo (.*)$")
public void visualizaLaFechaSeleccionada(String archivo) throws IOException {
        datos = CsvParser.readCSVFile(
        "src/test/resources/files/"+archivo.toString()+"");
        for (List<String> row : datos){
        fechaArchivo = row.get(1)+"/"+row.get(2)+"/"+row.get(0);     
        
    theActorInTheSpotlight().should(seeThat(ValidarFecha.validarFecha(),
    equalTo(fechaArchivo)).orComplainWith(GeneralException.class,
   ErrorMessage.MSG_ERROR));
}
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
