package com.sophossolutions.tasks.date_pickers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import com.sophossolutions.userinterfaces.HomePage;

public class NavegarDatePicker implements Task{ 
    
    @Override
    public <T extends Actor> void performAs(T actor) {
     
        actor.attemptsTo(
            Scroll.to(HomePage.SCROLL_HOME_PAGE),
            Click.on(HomePage.MENU_WIDGETS),
            Scroll.to(HomePage.OPTION_DATE_PICKER),
            Click.on(HomePage.OPTION_DATE_PICKER)
        );
    }

    public static NavegarDatePicker navegar() {
        return Tasks.instrumented(NavegarDatePicker.class);
    }
}
