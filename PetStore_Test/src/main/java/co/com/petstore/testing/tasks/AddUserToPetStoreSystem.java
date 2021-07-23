<<<<<<< HEAD
package co.com.petstore.testing.tasks;

import co.com.petstore.testing.interactions.SendRequest;
import co.com.petstore.testing.models.UserInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.*;

public class AddUserToPetStoreSystem implements Task {

    private final UserInfo userInfo;

    public AddUserToPetStoreSystem(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public static AddUserToPetStoreSystem withNextInfo(UserInfo userInfo) {
        return Tasks.instrumented(AddUserToPetStoreSystem.class, userInfo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CreateNewUser.requestJson(userInfo));
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "user"
                        , actor.recall(USER_INFORMATION)
                        , POST)
        );
        actor.remember(USER_NAME_FIELD, userInfo.getUserName());
    }
}
=======
package co.com.petstore.testing.tasks;

import co.com.petstore.testing.interactions.SendRequest;
import co.com.petstore.testing.models.UserInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.*;

public class AddUserToPetStoreSystem implements Task {

    private final UserInfo userInfo;

    public AddUserToPetStoreSystem(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public static AddUserToPetStoreSystem withNextInfo(UserInfo userInfo) {
        return Tasks.instrumented(AddUserToPetStoreSystem.class, userInfo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CreateNewUser.requestJson(userInfo));
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "user"
                        , actor.recall(USER_INFORMATION)
                        , POST)
        );
        actor.remember(USER_NAME_FIELD, userInfo.getUserName());
    }
}
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
