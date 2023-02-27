package com.sophossolutions.runners;

import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/web_tables.feature",
        glue = "com.sophossolutions",
        tags = "",
        snippets = SnippetType.CAMELCASE)
    
public class WebTables {

}
