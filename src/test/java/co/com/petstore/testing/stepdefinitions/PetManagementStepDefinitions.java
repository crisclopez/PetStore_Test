package co.com.petstore.testing.stepdefinitions;

import co.com.petstore.testing.models.PetInfo;
import co.com.petstore.testing.questions.VerifyPetAdded;
import co.com.petstore.testing.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;
import java.util.Map;

import static co.com.petstore.testing.utils.ConstantString.STATUS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PetManagementStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Seller");
    }

    @When("seller add a new pet to inventory")
    public void sellerAddANewPetToInventory(List<Map<String, Object>> table) {
        PetInfo petInfo = new PetInfo(table);
        theActorInTheSpotlight().attemptsTo(
                AddPetToStore.inventoryWithNextData(petInfo)
        );

    }

    @When("seller modify an existing pet information")
    public void sellerModifyExistingPetInformation(List<Map<String, Object>> table) {
        PetInfo petInfo = new PetInfo(table);
        theActorInTheSpotlight().attemptsTo(
                UpdatePetToStore.inventoryWithNextData(petInfo)
        );
    }

    @When("^seller is looking for a pet with id (.*)$")
    public void sellerIsLookingForAPetWithId(String petId) {
        theActorInTheSpotlight().attemptsTo(
                FindPetById.with(petId)
        );
    }

    @When("^seller is looking for a pet with status (.*)$")
    public void sellerIsLookingForAPetWithStatusAvailable(String status) {
        theActorInTheSpotlight().attemptsTo(
                FindPetByStatus.with(status)
        );
    }

    @When("^seller is looking for a pet with tag (.*)$")
    public void sellerIsLookingForAPetWithTagAdorable(String tag) {
        theActorInTheSpotlight().attemptsTo(
                FindPetByTag.with(tag)
        );
    }

    @When("^seller delete a pet with id (.*)$")
    public void sellerDeleteAPetWithId(String petId) {
        theActorInTheSpotlight().attemptsTo(
                DeletePetFrom.inventoryWithThis(petId)
        );
    }

    @Then("inventory changed successfully")
    public void inventoryChangedSuccessfully() {
        int resultStatus = theActorInTheSpotlight().recall(STATUS);
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(resultStatus).isEqualTo(200)
        );
        theActorInTheSpotlight().should(
                seeThat(VerifyPetAdded.jsonResponse()));
    }

    @Then("^request fail with status (.*)$")
    public void requestFail(int status) {
        int resultStatus = theActorInTheSpotlight().recall(STATUS);
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(resultStatus).isEqualTo(status)
        );
    }

    @Then("information returned by system successfully")
    public void informationReturnedBySystemSuccessfully() {
        int resultStatus = theActorInTheSpotlight().recall(STATUS);
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(resultStatus).isEqualTo(200)
        );
    }
}