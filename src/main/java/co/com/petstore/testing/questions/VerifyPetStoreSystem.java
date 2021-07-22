package co.com.petstore.testing.questions;

import io.restassured.path.json.JsonPath;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.petstore.testing.utils.ConstantString.*;

public class VerifyPetStoreSystem implements Question<Boolean> {

    public static VerifyPetStoreSystem jsonResponse() {
        return new VerifyPetStoreSystem();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        JsonPath jsonResponse = actor.recall(JSON_RESPONSE);
        String userNameObtained = jsonResponse.get(USER_NAME_JSON_FIELD).toString();
        String userNameExpected = actor.recall(USER_NAME_FIELD).toString();
        return userNameObtained.equals(userNameExpected);
    }
}
