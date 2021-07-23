<<<<<<< HEAD
package co.com.petstore.testing.tasks;

import co.com.petstore.testing.interactions.SendRequest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.DELETE;
import static co.com.petstore.testing.utils.ConstantString.SERVICE_ENDPOINT;

public class DeleteUser implements Task {

    private final String userName;

    public DeleteUser(String userName) {
        this.userName = userName;
    }

    public static DeleteUser withThis(String userName) {
        return Tasks.instrumented(DeleteUser.class, userName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "user/" + userName
                        , DELETE)
        );
    }
}
=======
package co.com.petstore.testing.tasks;

import co.com.petstore.testing.interactions.SendRequest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.DELETE;
import static co.com.petstore.testing.utils.ConstantString.SERVICE_ENDPOINT;

public class DeleteUser implements Task {

    private final String userName;

    public DeleteUser(String userName) {
        this.userName = userName;
    }

    public static DeleteUser withThis(String userName) {
        return Tasks.instrumented(DeleteUser.class, userName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "user/" + userName
                        , DELETE)
        );
    }
}
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
