package co.com.petstore.testing.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/usersmanagement.feature"},
        glue = {"co.com.petstore.testing.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class UsersManagement {
}
