package com.sophossolutions.tasks.alerts;
import com.sophossolutions.userinterfaces.Alerts;
import com.sophossolutions.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class ClickButton implements Task{

    String button;

    public ClickButton(String button) {
        this.button = button;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Scroll.to(HomePage.SCROLL_TITTLE_PAGE),
            Click.on(Alerts.BUTTON.of(button)));
            BrowseTheWeb.as(actor).waitFor(alertIsPresent());
            BrowseTheWeb.as(actor).getAlert().accept(); 
    }

    public static ClickButton clicButton(String button) {
        return Tasks.instrumented(ClickButton.class,button);
    }

   
}
