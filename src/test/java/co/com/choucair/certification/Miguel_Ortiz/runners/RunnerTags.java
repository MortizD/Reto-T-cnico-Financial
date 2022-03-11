package co.com.choucair.certification.Miguel_Ortiz.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/Reto_Tecnico.feature",
                              tags = "@stories",
                              glue = "co.com.choucair.certification.Miguel_Ortiz.stepdefinitions",
                              snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
