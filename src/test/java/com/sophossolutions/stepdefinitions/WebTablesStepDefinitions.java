package com.sophossolutions.stepdefinitions;
import net.serenitybdd.screenplay.actions.Open;
import com.sophossolutions.tasks.web_tables.AgregarRegistro;
import com.sophossolutions.tasks.web_tables.EliminarRegistro;
import com.sophossolutions.tasks.web_tables.NavegarWebTables;
import com.sophossolutions.tasks.web_tables.ValidarRegistroCreado;
import com.sophossolutions.tasks.web_tables.ValidarRegistroEliminado;
import com.sophossolutions.userinterfaces.HomePage;
import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class WebTablesStepDefinitions {

    private HomePage homePage = new HomePage();
           
    @Given("^(.*) ingresa a la Home Page$")
    public void IngresaALaHomePage(String name) {
        theActorCalled(name).wasAbleTo(Open.browserOn(homePage));
    }
    
    @When("^se desplaza a la pagina de web tables$")
    public void seDesplazaALaPaginaDeWebTables() {
        theActorInTheSpotlight().wasAbleTo(NavegarWebTables.navegar());
    }

    @When("^elimina el registro de la tabla posicion (.*)$")
    public void eliminaElRegistroDeLaTabla(String posicion) {
        theActorInTheSpotlight().attemptsTo(EliminarRegistro.eliminarRegistro(posicion));
    }
    
    @When("^agrega un nuevo registro a la tabla$")
    public void agregaUnNuevoRegistroALaTabla(DataTable table) {
        theActorInTheSpotlight().attemptsTo(AgregarRegistro.agregarRegistro(table));
    }
    @Then("^visualiza que se elimino el registro con primer nombre (.*)$")
    public void visualizaQueSeEliminaraElRegistroConNombre(String firtsName ) {
        theActorInTheSpotlight().attemptsTo(ValidarRegistroEliminado.validarRegistroEliminado(firtsName));
    }
    @Then("^visualiza el nuevo registro creado con primer nombre (.*)$")
    public void visualizaElNuevoRegistroCreado(String firtsName) {
        theActorInTheSpotlight().attemptsTo(ValidarRegistroCreado.validarRegistroCreado(firtsName));
    }
}
