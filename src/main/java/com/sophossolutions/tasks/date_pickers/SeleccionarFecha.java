package com.sophossolutions.tasks.date_pickers;
import com.sophossolutions.userinterfaces.DatePicker;
import com.sophossolutions.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;


public class SeleccionarFecha implements Task {

private final String year, month,day;

    public SeleccionarFecha(String year, String month,String day) {
    this.year = year;
    this.month = month;
    this.day = day;
}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(  
            Scroll.to(HomePage.SCROLL_TITTLE_PAGE),
            Click.on(DatePicker.INPUT_DATE),
            SendKeys.of(year).into(DatePicker.SELECT_YEAR_DATE),
            SendKeys.of(month).into(DatePicker.SELECT_MONTH_DATE),
           Click.on(DatePicker.SELECT_DAY_DATE.of(day.toString()))
        );
    }

    public static SeleccionarFecha seleccionarFecha(String year, String month,String day) {
        return Tasks.instrumented(SeleccionarFecha.class, year,month,day);
    }
}
