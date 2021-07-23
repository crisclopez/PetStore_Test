package co.com.petstore.testing.stepdefinitions;

import co.com.petstore.testing.models.OrderInfo;
import co.com.petstore.testing.questions.VerifyOrderAdded;
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

public class StoreManagementStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Seller");
    }


    @When("seller place new order for a pet")
    public void sellerPlaceNewOrderForAPet(List<Map<String, Object>> table) {
        OrderInfo orderInfo = new OrderInfo(table);
        theActorInTheSpotlight().attemptsTo(
                AddOrderInStore.withNextInfo(orderInfo)
        );
    }

    @When("seller is looking for all pet inventories by status")
    public void sellerIsLookingForAllPetInventoriesByStatus() {
        theActorInTheSpotlight().attemptsTo(
                FindAllOrders.byStatus()
        );
    }

    @When("^seller is looking for a purchase order with id (.*)$")
    public void sellerIsLookingForAPurchaseOrderWithId(String purchaseId) {
        theActorInTheSpotlight().attemptsTo(
                FindPurchaseById.with(purchaseId)
        );
    }

    @When("^seller delete a purchase order with id (.*)$")
    public void sellerDeleteAPurchaseOrderWithId(String purchaseId) {
        theActorInTheSpotlight().attemptsTo(
                DeletePurchaseFrom.inventoryWithThis(purchaseId)
        );
    }

    @Then("store updated successfully")
    public void storeUpdatedSuccessfully() {
        int resultStatus = theActorInTheSpotlight().recall(STATUS);
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(resultStatus).isEqualTo(200)
        );
        theActorInTheSpotlight().should(
                seeThat(VerifyOrderAdded.jsonResponse()));
    }

}
