<<<<<<< HEAD
package co.com.petstore.testing.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/storemanagement.feature"},
        glue = {"co.com.petstore.testing.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class StoreManagement {
}
=======
package co.com.petstore.testing.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/storemanagement.feature"},
        glue = {"co.com.petstore.testing.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class StoreManagement {
}
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
