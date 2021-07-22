package co.com.petstore.testing.tasks;

import co.com.petstore.testing.interactions.SendRequest;
import co.com.petstore.testing.models.OrderInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.*;

public class AddOrderInStore implements Task {

    private final OrderInfo orderInfo;

    public AddOrderInStore(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    public static AddOrderInStore withNextInfo(OrderInfo orderInfo) {
        return Tasks.instrumented(AddOrderInStore.class, orderInfo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CreateNewOrder.requestJson(orderInfo)
        );
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "store/order"
                        , actor.recall(ORDER_INFORMATION)
                        , POST)
        );
        actor.remember(PET_ID_FIELD, orderInfo.getPetId());
    }
}
