package com.sophossolutions.stepdefinitions;

import com.sophossolutions.tasks.alerts.ClickButton;
import com.sophossolutions.tasks.alerts.ClickButtonWithText;
import com.sophossolutions.tasks.alerts.NavegarAlerts;
import com.sophossolutions.tasks.alerts.VisualizarTexto;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AlertsStepDefinitions {

@When("^se desplaza a la pagina de alertas$")
public void seDesplazaALaPaginaDeAlertas() {
    theActorInTheSpotlight().wasAbleTo(NavegarAlerts.navegar());
}

@When("^da click en el Button (.*)$")
public void daClickEnElButtonToSeeAlert(String button) {
    theActorInTheSpotlight().attemptsTo(ClickButton.clicButton(button));
}

@When("^da clic en el Button (.*) enviando el nombre (.*)$")
public void diligenciaNombreEnElTexbox(String button, String name) {
    theActorInTheSpotlight().attemptsTo(ClickButtonWithText.clicButtonwithText(button,name));
}

@Then("^visualiza el texto (.*)$")
public void visualizaElTexto(String name) {
    theActorInTheSpotlight().attemptsTo(VisualizarTexto.visualizarTexto(name));
}

}
