package com.sophossolutions.questions;

import java.util.List;
import com.sophossolutions.util.CsvParser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarFechaArchivo implements Question<String>{

private String archivo, fechaArchivo;
private List<List<String>> datos;

    public ValidarFechaArchivo(String archivo) {
    this.archivo = archivo;
}

    @Override
    public String answeredBy(Actor actor) {
        datos = CsvParser.readCSVFile(
        "src/test/resources/files/"+archivo.toString()+"");
        for (List<String> row : datos){
        fechaArchivo = row.get(1)+"/"+row.get(2)+"/"+row.get(0);   
        
    }
   return fechaArchivo.toString();  
}    


    public static ValidarFechaArchivo validarFechaArchivo(String archivo) {
        return new ValidarFechaArchivo(archivo);
}    
}
