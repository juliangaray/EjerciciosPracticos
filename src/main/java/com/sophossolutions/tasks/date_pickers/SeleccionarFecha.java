package com.sophossolutions.tasks.date_pickers;
import java.util.List;
import com.sophossolutions.userinterfaces.DatePicker;
import com.sophossolutions.userinterfaces.HomePage;
import com.sophossolutions.util.CsvParser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;

public class SeleccionarFecha implements Task {

private String archivo;
private List<List<String>> datos;

    public SeleccionarFecha(String archivo) {
    this.archivo = archivo;
}

    @Override
    public <T extends Actor> void performAs(T actor) {
        datos = CsvParser.readCSVFile("src/test/resources/files/"+archivo.toString()+"");
        for (List<String> row : datos){  

            actor.attemptsTo(  
            Scroll.to(HomePage.SCROLL_TITTLE_PAGE),
            Click.on(DatePicker.INPUT_DATE),
            SendKeys.of(row.get(0)).into(DatePicker.SELECT_YEAR_DATE),
            SendKeys.of(row.get(1)).into(DatePicker.SELECT_MONTH_DATE),
            Click.on(DatePicker.SELECT_DAY_DATE.of(row.get(2).toString()))
            );
        }
    }

    public static SeleccionarFecha seleccionarFecha(String archivo) {
        return Tasks.instrumented(SeleccionarFecha.class, archivo);
    }
}
