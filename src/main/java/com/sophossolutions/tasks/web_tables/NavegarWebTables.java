package com.sophossolutions.tasks.web_tables;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import com.sophossolutions.userinterfaces.HomePage;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavegarWebTables implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Scroll.to(HomePage.SCROLL_HOME_PAGE),
            Click.on(HomePage.MENU_ELEMENTS),
            Scroll.to(HomePage.OPTION_WEB_TABLES),
            Click.on(HomePage.OPTION_WEB_TABLES));     
    }

    public static NavegarWebTables navegar() {
        return instrumented(NavegarWebTables.class);
    }
    
}
