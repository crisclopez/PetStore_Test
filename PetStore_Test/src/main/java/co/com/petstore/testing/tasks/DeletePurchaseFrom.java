<<<<<<< HEAD
package co.com.petstore.testing.tasks;

import co.com.petstore.testing.interactions.SendRequest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.DELETE;
import static co.com.petstore.testing.utils.ConstantString.SERVICE_ENDPOINT;

public class DeletePurchaseFrom implements Task {

    private final String purchaseId;

    public DeletePurchaseFrom(String purchaseId) {
        this.purchaseId = purchaseId;
    }


    public static DeletePurchaseFrom inventoryWithThis(String purchaseId) {
        return Tasks.instrumented(DeletePurchaseFrom.class, purchaseId);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "store/order/" + purchaseId
                        , DELETE)
        );
    }
}
=======
package co.com.petstore.testing.tasks;

import co.com.petstore.testing.interactions.SendRequest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.DELETE;
import static co.com.petstore.testing.utils.ConstantString.SERVICE_ENDPOINT;

public class DeletePurchaseFrom implements Task {

    private final String purchaseId;

    public DeletePurchaseFrom(String purchaseId) {
        this.purchaseId = purchaseId;
    }


    public static DeletePurchaseFrom inventoryWithThis(String purchaseId) {
        return Tasks.instrumented(DeletePurchaseFrom.class, purchaseId);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "store/order/" + purchaseId
                        , DELETE)
        );
    }
}
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
