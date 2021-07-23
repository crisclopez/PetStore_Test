package co.com.petstore.testing.tasks;

import co.com.petstore.testing.interactions.SendRequest;
import co.com.petstore.testing.models.UserInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.*;

public class UserLogsIntoApplication implements Task {

    private final UserInfo userInfo;

    public UserLogsIntoApplication(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public static UserLogsIntoApplication withNextCredentials(UserInfo userInfo) {
        return Tasks.instrumented(UserLogsIntoApplication.class, userInfo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(PARAM1, USER_NAME_JSON_FIELD);
        actor.remember(PARAM2, PASSWORD);
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "user/login"
                        , userInfo.getUserName()
                        , userInfo.getPassword()
                        , GET_WITH_TWO_PARAMS)
        );
    }
}
