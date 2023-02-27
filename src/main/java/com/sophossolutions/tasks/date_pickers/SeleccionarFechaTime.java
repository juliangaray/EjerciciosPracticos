package com.sophossolutions.tasks.date_pickers;
import java.util.Map;
import com.sophossolutions.userinterfaces.DatePicker;
import com.sophossolutions.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import io.cucumber.datatable.DataTable;

public class SeleccionarFechaTime implements Task {

    private Map<String, String> data;
  
    public SeleccionarFechaTime(DataTable data) {
        this.data = data.asMap(String.class, String.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(     
            Scroll.to(HomePage.SCROLL_TITTLE_PAGE), 
            Click.on(DatePicker.INPUT_DATE_TIME),
            Click.on(DatePicker.SPAN_YEAR_DATE_TIME),
            Click.on(DatePicker.SELECT_YEAR_DATE_TIME.of(data.get("year"))),
            Click.on(DatePicker.SPAN_MONTH_DATE_TIME),
            Click.on(DatePicker.SELECT_MONTH_DATE_TIME.of(data.get("month"))),
            Click.on(DatePicker.SELECT_DAY_DATE.of(((data.get("day")).toString()))),
            Click.on(DatePicker.SELECT_TIME.of(((data.get("time")).toString())))
         
        );
    }

    public static SeleccionarFechaTime seleccionarFechaTime(DataTable data) {
        return Tasks.instrumented(SeleccionarFechaTime.class, data);
    }
}
