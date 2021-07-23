<<<<<<< HEAD
package co.com.petstore.testing.interactions;

import co.com.petstore.testing.exceptions.ExceptionMessages;
import co.com.petstore.testing.exceptions.MyBusinessException;
import io.restassured.path.json.JsonPath;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.*;

public class SendRequest implements Interaction {

    private final String endpoint;
    private final String service;
    private final String information;
    private final String restOperation;
    private final String param;


    public SendRequest(String endpoint, String service, String information, String param, String restOperation) {
        this.endpoint = endpoint;
        this.service = service;
        this.information = information;
        this.param = param;
        this.restOperation = restOperation;

    }

    public static SendRequest toService(String endpoint, String service, String information, String restOperation) {
        return Tasks.instrumented(SendRequest.class, endpoint, service, information, "param", restOperation);
    }

    public static SendRequest toService(String endpoint, String service, String restOperation) {
        return Tasks.instrumented(SendRequest.class, endpoint, service, "dummy", "param", restOperation);
    }

    public static SendRequest toService(String endpoint, String service, String information, String param, String restOperation) {
        return Tasks.instrumented(SendRequest.class, endpoint, service, information, param, restOperation);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int status;
        JsonPath result;
        try {
            switch (restOperation) {
                case POST:
                    SerenityRest.given().contentType(APPLICATION_JSON)
                            .body(information)
                            .baseUri(endpoint)
                            .basePath(service)
                            .when().post();
                    break;
                case PUT:
                    SerenityRest.given().contentType(APPLICATION_JSON)
                            .body(information)
                            .baseUri(endpoint)
                            .basePath(service)
                            .when().put();
                    break;
                case GET:
                    SerenityRest.given().contentType(APPLICATION_JSON)
                            .baseUri(endpoint)
                            .basePath(service)
                            .when().get();
                    break;
                case GET_WITH_PARAM:
                    SerenityRest.given().contentType(APPLICATION_JSON)
                            .baseUri(endpoint)
                            .basePath(service)
                            .queryParam(actor.recall(PARAM1), information)
                            .when().get();
                    break;
                case GET_WITH_TWO_PARAMS:
                    SerenityRest.given().contentType(APPLICATION_JSON)
                            .baseUri(endpoint)
                            .basePath(service)
                            .queryParam(actor.recall(PARAM1), information)
                            .queryParam(actor.recall(PARAM2), param)
                            .when().get();
                    break;
                case DELETE:
                    SerenityRest.given().contentType(APPLICATION_JSON)
                            .baseUri(endpoint)
                            .basePath(service)
                            .when().delete();
                    break;
            }

            result = SerenityRest.lastResponse().jsonPath();
            status = SerenityRest.lastResponse().statusCode();
            actor.remember(STATUS, status);
            actor.remember(JSON_RESPONSE, result);
        } catch (Exception ex) {
            throw new MyBusinessException(String.format(ExceptionMessages.JSON_NOT_RESPONSE.getMessage(), service, ex));
        }
    }
=======
package co.com.petstore.testing.interactions;

import co.com.petstore.testing.exceptions.ExceptionMessages;
import co.com.petstore.testing.exceptions.MyBusinessException;
import io.restassured.path.json.JsonPath;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.*;

public class SendRequest implements Interaction {

    private final String endpoint;
    private final String service;
    private final String information;
    private final String restOperation;
    private final String param;


    public SendRequest(String endpoint, String service, String information, String param, String restOperation) {
        this.endpoint = endpoint;
        this.service = service;
        this.information = information;
        this.param = param;
        this.restOperation = restOperation;

    }

    public static SendRequest toService(String endpoint, String service, String information, String restOperation) {
        return Tasks.instrumented(SendRequest.class, endpoint, service, information, "param", restOperation);
    }

    public static SendRequest toService(String endpoint, String service, String restOperation) {
        return Tasks.instrumented(SendRequest.class, endpoint, service, "dummy", "param", restOperation);
    }

    public static SendRequest toService(String endpoint, String service, String information, String param, String restOperation) {
        return Tasks.instrumented(SendRequest.class, endpoint, service, information, param, restOperation);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int status;
        JsonPath result;
        try {
            switch (restOperation) {
                case POST:
                    SerenityRest.given().contentType(APPLICATION_JSON)
                            .body(information)
                            .baseUri(endpoint)
                            .basePath(service)
                            .when().post();
                    break;
                case PUT:
                    SerenityRest.given().contentType(APPLICATION_JSON)
                            .body(information)
                            .baseUri(endpoint)
                            .basePath(service)
                            .when().put();
                    break;
                case GET:
                    SerenityRest.given().contentType(APPLICATION_JSON)
                            .baseUri(endpoint)
                            .basePath(service)
                            .when().get();
                    break;
                case GET_WITH_PARAM:
                    SerenityRest.given().contentType(APPLICATION_JSON)
                            .baseUri(endpoint)
                            .basePath(service)
                            .queryParam(actor.recall(PARAM1), information)
                            .when().get();
                    break;
                case GET_WITH_TWO_PARAMS:
                    SerenityRest.given().contentType(APPLICATION_JSON)
                            .baseUri(endpoint)
                            .basePath(service)
                            .queryParam(actor.recall(PARAM1), information)
                            .queryParam(actor.recall(PARAM2), param)
                            .when().get();
                    break;
                case DELETE:
                    SerenityRest.given().contentType(APPLICATION_JSON)
                            .baseUri(endpoint)
                            .basePath(service)
                            .when().delete();
                    break;
            }

            result = SerenityRest.lastResponse().jsonPath();
            status = SerenityRest.lastResponse().statusCode();
            actor.remember(STATUS, status);
            actor.remember(JSON_RESPONSE, result);
        } catch (Exception ex) {
            throw new MyBusinessException(String.format(ExceptionMessages.JSON_NOT_RESPONSE.getMessage(), service, ex));
        }
    }
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
}