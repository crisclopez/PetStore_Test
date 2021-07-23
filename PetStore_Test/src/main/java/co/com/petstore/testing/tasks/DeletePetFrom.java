<<<<<<< HEAD
package co.com.petstore.testing.tasks;

import co.com.petstore.testing.interactions.SendRequest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.DELETE;
import static co.com.petstore.testing.utils.ConstantString.SERVICE_ENDPOINT;

public class DeletePetFrom implements Task {

    private final String petId;

    public DeletePetFrom(String petId) {
        this.petId = petId;
    }

    public static DeletePetFrom inventoryWithThis(String petId) {
        return Tasks.instrumented(DeletePetFrom.class, petId);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "pet/" + petId
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

public class DeletePetFrom implements Task {

    private final String petId;

    public DeletePetFrom(String petId) {
        this.petId = petId;
    }

    public static DeletePetFrom inventoryWithThis(String petId) {
        return Tasks.instrumented(DeletePetFrom.class, petId);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "pet/" + petId
                        , DELETE)
        );
    }
}
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
