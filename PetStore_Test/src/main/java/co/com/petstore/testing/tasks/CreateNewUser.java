package co.com.petstore.testing.tasks;

import co.com.petstore.testing.models.CreateUserRequestJson;
import co.com.petstore.testing.models.UserInfo;
import co.com.petstore.testing.models.builder.CreateUserRequestJsonBuilder;
import co.com.petstore.testing.utils.GenerateRandom;
import com.google.gson.Gson;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.USER_INFORMATION;

public class CreateNewUser implements Task {

    private final UserInfo userInfo;

    public CreateNewUser(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public static CreateNewUser requestJson(UserInfo userInfo) {
        return Tasks.instrumented(CreateNewUser.class, userInfo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Gson gson = new Gson();

        CreateUserRequestJson userInfoRequest = new CreateUserRequestJsonBuilder()
                .withId(GenerateRandom.data(2))
                .andUserName(userInfo.getUserName())
                .andFirstName(userInfo.getFirstName())
                .andLastName(userInfo.getLastName())
                .andEmail(userInfo.getEmail())
                .andPassword(userInfo.getPassword())
                .andPhone(userInfo.getPhone())
                .andUserStatus(userInfo.getUserStatus())
                .build();

        String userInfoRequestJson = gson
                .toJson(userInfoRequest);

        actor.remember(USER_INFORMATION, userInfoRequestJson);
    }
}
