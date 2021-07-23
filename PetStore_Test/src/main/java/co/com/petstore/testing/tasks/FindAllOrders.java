<<<<<<< HEAD
package co.com.petstore.testing.tasks;

import co.com.petstore.testing.interactions.SendRequest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.GET;
import static co.com.petstore.testing.utils.ConstantString.SERVICE_ENDPOINT;

public class FindAllOrders implements Task {


    public static FindAllOrders byStatus() {
        return Tasks.instrumented(FindAllOrders.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "store/inventory"
                        , GET)
        );
    }
}
=======
package co.com.petstore.testing.tasks;

import co.com.petstore.testing.interactions.SendRequest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.GET;
import static co.com.petstore.testing.utils.ConstantString.SERVICE_ENDPOINT;

public class FindAllOrders implements Task {


    public static FindAllOrders byStatus() {
        return Tasks.instrumented(FindAllOrders.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "store/inventory"
                        , GET)
        );
    }
}
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
