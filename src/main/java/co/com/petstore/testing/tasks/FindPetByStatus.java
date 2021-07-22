package co.com.petstore.testing.tasks;

import co.com.petstore.testing.interactions.SendRequest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.*;

public class FindPetByStatus implements Task {

    private final String status;

    public FindPetByStatus(String status) {
        this.status = status;
    }

    public static FindPetByStatus with(String status) {
        return Tasks.instrumented(FindPetByStatus.class, status);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(PARAM1, STATUS);
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "pet/findByStatus"
                        , status
                        , GET_WITH_PARAM)
        );
    }
}
