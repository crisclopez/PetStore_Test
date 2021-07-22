package co.com.petstore.testing.tasks;

import co.com.petstore.testing.interactions.SendRequest;
import co.com.petstore.testing.models.UserInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.*;

public class UpdateExistingUserToPetStoreSystem implements Task {

    private final UserInfo userInfo;

    public UpdateExistingUserToPetStoreSystem(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public static UpdateExistingUserToPetStoreSystem withNextData(UserInfo userInfo) {
        return Tasks.instrumented(UpdateExistingUserToPetStoreSystem.class, userInfo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CreateNewUser.requestJson(userInfo));
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "user/" + userInfo.getUserName()
                        , actor.recall(USER_INFORMATION)
                        , PUT)
        );
        actor.remember(USER_NAME_FIELD, userInfo.getUserName());
    }
}
