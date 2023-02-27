package com.sophossolutions.tasks.alerts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import com.sophossolutions.userinterfaces.HomePage;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavegarAlerts implements Task{
    
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Scroll.to(HomePage.SCROLL_HOME_PAGE),
            Click.on(HomePage.MENU_ALERTS),
            Scroll.to(HomePage.OPTION_ALERTS),
            Click.on(HomePage.OPTION_ALERTS)
        );
    }

    public static NavegarAlerts navegar() {
        return instrumented(NavegarAlerts.class);
    }
}
