<<<<<<< HEAD
package co.com.petstore.testing.tasks;

import co.com.petstore.testing.interactions.SendRequest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.*;

public class FindPetByTag implements Task {

    private final String tag;

    public FindPetByTag(String tag) {
        this.tag = tag;
    }

    public static FindPetByTag with(String tag) {
        return Tasks.instrumented(FindPetByTag.class, tag);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(PARAM1, "tags");
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "pet/findByTags", tag
                        , GET_WITH_PARAM)
        );
    }
}
=======
package co.com.petstore.testing.tasks;

import co.com.petstore.testing.interactions.SendRequest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.*;

public class FindPetByTag implements Task {

    private final String tag;

    public FindPetByTag(String tag) {
        this.tag = tag;
    }

    public static FindPetByTag with(String tag) {
        return Tasks.instrumented(FindPetByTag.class, tag);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(PARAM1, "tags");
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "pet/findByTags", tag
                        , GET_WITH_PARAM)
        );
    }
}
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
