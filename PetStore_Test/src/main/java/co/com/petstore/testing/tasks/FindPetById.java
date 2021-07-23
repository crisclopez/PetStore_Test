<<<<<<< HEAD
package co.com.petstore.testing.tasks;

import co.com.petstore.testing.interactions.SendRequest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.GET;
import static co.com.petstore.testing.utils.ConstantString.SERVICE_ENDPOINT;

public class FindPetById implements Task {

    private final String petId;

    public FindPetById(String petId) {
        this.petId = petId;
    }

    public static FindPetById with(String petId) {
        return Tasks.instrumented(FindPetById.class, petId);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "pet/" + petId
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

public class FindPetById implements Task {

    private final String petId;

    public FindPetById(String petId) {
        this.petId = petId;
    }

    public static FindPetById with(String petId) {
        return Tasks.instrumented(FindPetById.class, petId);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "pet/" + petId
                        , GET)
        );
    }
}
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
