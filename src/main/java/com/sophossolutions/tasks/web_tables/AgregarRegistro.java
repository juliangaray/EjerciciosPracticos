package com.sophossolutions.tasks.web_tables;
import java.util.Map;
import com.sophossolutions.userinterfaces.HomePage;
import com.sophossolutions.userinterfaces.WebTables;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import io.cucumber.datatable.DataTable;

public class AgregarRegistro implements Task {
    
    private Map<String, String> data;

    public AgregarRegistro(DataTable data) {
        this.data = data.asMap(String.class, String.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(      
            Scroll.to(HomePage.SCROLL_TITTLE_PAGE),
            Click.on(WebTables.BUTTON_ADD),
            Enter.theValue(data.get("firstName")).into(WebTables.TEXBOX_FIRST_NAME),
            Enter.theValue(data.get("lastName")).into(WebTables.TEXBOX_LAST_NAME),
            Enter.theValue(data.get("email")).into(WebTables.TEXBOX_EMAIL),
            Enter.theValue(data.get("age")).into(WebTables.TEXBOX_AGE),
            Enter.theValue(data.get("salary")).into(WebTables.TEXBOX_SALARY),
            Enter.theValue(data.get("Department")).into(WebTables.TEXBOX_DEPARTMENT),
            Click.on(WebTables.BUTTON_SUBMIT)
            );               
        }

    public static AgregarRegistro agregarRegistro(DataTable data) {
        return Tasks.instrumented(AgregarRegistro.class, data);
    }
    
}
