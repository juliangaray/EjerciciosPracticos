package com.sophossolutions.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/alerts.feature",
        glue = "com.sophossolutions",
        tags = "@1",
        snippets = SnippetType.CAMELCASE)        

public class Alerts {
    
}
