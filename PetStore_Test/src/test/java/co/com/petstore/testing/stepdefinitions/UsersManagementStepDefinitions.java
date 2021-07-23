package co.com.petstore.testing.stepdefinitions;

import co.com.petstore.testing.models.UserInfo;
import co.com.petstore.testing.questions.VerifyPetStoreSystem;
import co.com.petstore.testing.tasks.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;
import java.util.Map;

import static co.com.petstore.testing.utils.ConstantString.STATUS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UsersManagementStepDefinitions {


    @When("admin create a new user for pet store system")
    public void adminCreateANewUserForPetStoreSystem(List<Map<String, Object>> dataTable) {
        UserInfo userInfo = new UserInfo(dataTable);
        theActorInTheSpotlight().attemptsTo(
                AddUserToPetStoreSystem.withNextInfo(userInfo)
        );
    }

    @When("admin modify an existing user")
    public void adminModifyAnExistingUser(List<Map<String, Object>> dataTable) {
        UserInfo userInfo = new UserInfo(dataTable);
        theActorInTheSpotlight().attemptsTo(
                UpdateExistingUserToPetStoreSystem.withNextData(userInfo)
        );
    }

    @When("^admin is looking for a user by this username (.*)$")
    public void adminIsLookingForAUserByThisUsername(String userName) {
        theActorInTheSpotlight().attemptsTo(
                FindUser.byThis(userName)
        );
    }

    @When("user put his credentials into the system")
    public void userPutHisCredentialsIntoTheSystem(List<Map<String, Object>> dataTable) {
        UserInfo userInfo = new UserInfo(dataTable);
        theActorInTheSpotlight().attemptsTo(
                UserLogsIntoApplication.withNextCredentials(userInfo)
        );
    }

    @When("user log out his user session")
    public void userLogOutHisUserSession() {
        theActorInTheSpotlight().attemptsTo(
                UserLogsOut.hisCurrentSession()
        );
    }

    @When("^admin delete user for the system with this username (.*)$")
    public void adminDeleteUserForTheSystemWithThisUsername(String userName) {
        theActorInTheSpotlight().attemptsTo(
                DeleteUser.withThis(userName)
        );
    }


    @Then("pet store system modified successfully")
    public void petStoreSystemModifiedSuccessfully() {
        int resultStatus = theActorInTheSpotlight().recall(STATUS);
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(resultStatus).isEqualTo(200)
        );
        theActorInTheSpotlight().should(
                seeThat(VerifyPetStoreSystem.jsonResponse()));
    }
}
