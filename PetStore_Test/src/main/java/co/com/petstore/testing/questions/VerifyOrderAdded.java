<<<<<<< HEAD
package co.com.petstore.testing.questions;

import io.restassured.path.json.JsonPath;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.petstore.testing.utils.ConstantString.JSON_RESPONSE;
import static co.com.petstore.testing.utils.ConstantString.PET_ID_FIELD;

public class VerifyOrderAdded implements Question<Boolean> {


    public static VerifyOrderAdded jsonResponse() {
        return new VerifyOrderAdded();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        JsonPath jsonResponse = actor.recall(JSON_RESPONSE);
        String petIdObtained = jsonResponse.get(PET_ID_FIELD).toString();
        String petIdExpected = actor.recall(PET_ID_FIELD).toString();
        return petIdObtained.equals(petIdExpected);
    }
}
=======
package co.com.petstore.testing.questions;

import io.restassured.path.json.JsonPath;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.petstore.testing.utils.ConstantString.JSON_RESPONSE;
import static co.com.petstore.testing.utils.ConstantString.PET_ID_FIELD;

public class VerifyOrderAdded implements Question<Boolean> {


    public static VerifyOrderAdded jsonResponse() {
        return new VerifyOrderAdded();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        JsonPath jsonResponse = actor.recall(JSON_RESPONSE);
        String petIdObtained = jsonResponse.get(PET_ID_FIELD).toString();
        String petIdExpected = actor.recall(PET_ID_FIELD).toString();
        return petIdObtained.equals(petIdExpected);
    }
}
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
