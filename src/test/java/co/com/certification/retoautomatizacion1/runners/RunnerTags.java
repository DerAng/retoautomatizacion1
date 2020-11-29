package co.com.certification.retoautomatizacion1.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/uTest.feature",
        tags = "@Stories",
        glue =  "co.com.certification.retoautomatizacion1.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {



}
