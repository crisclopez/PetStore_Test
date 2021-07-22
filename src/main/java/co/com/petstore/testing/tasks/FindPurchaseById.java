package co.com.petstore.testing.tasks;

import co.com.petstore.testing.interactions.SendRequest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.GET;
import static co.com.petstore.testing.utils.ConstantString.SERVICE_ENDPOINT;

public class FindPurchaseById implements Task {

    private final String purchaseId;

    public FindPurchaseById(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public static FindPurchaseById with(String purchaseId) {
        return Tasks.instrumented(FindPurchaseById.class, purchaseId);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "store/order/" + purchaseId
                        , GET)
        );
    }
}
