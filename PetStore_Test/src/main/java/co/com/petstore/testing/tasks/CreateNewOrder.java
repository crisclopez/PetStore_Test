<<<<<<< HEAD
package co.com.petstore.testing.tasks;

import co.com.petstore.testing.models.AddOrderInfoRequestJson;
import co.com.petstore.testing.models.OrderInfo;
import co.com.petstore.testing.models.builder.AddOrderInfoRequestJsonBuilder;
import co.com.petstore.testing.utils.GenerateRandom;
import co.com.petstore.testing.utils.GetCurrent;
import com.google.gson.Gson;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.ORDER_INFORMATION;

public class CreateNewOrder implements Task {

    private final OrderInfo orderInfo;

    public CreateNewOrder(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    public static CreateNewOrder requestJson(OrderInfo orderInfo) {
        return Tasks.instrumented(CreateNewOrder.class, orderInfo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Gson gson = new Gson();
        boolean complete = true;
        if (orderInfo.getComplete().equals("false")) {
            complete = false;
        }

        AddOrderInfoRequestJson orderInfoRequest = new AddOrderInfoRequestJsonBuilder()
                .withOrderId(GenerateRandom.data(2))
                .andPetId(orderInfo.getPetId())
                .andQuantity(orderInfo.getQuantity())
                .andShipDate(GetCurrent.date())
                .andStatus(orderInfo.getStatus())
                .andComplete(complete)
                .build();

        String orderInfoRequestJson = gson
                .toJson(orderInfoRequest);
        actor.remember(ORDER_INFORMATION, orderInfoRequestJson);
    }
}
=======
package co.com.petstore.testing.tasks;

import co.com.petstore.testing.models.AddOrderInfoRequestJson;
import co.com.petstore.testing.models.OrderInfo;
import co.com.petstore.testing.models.builder.AddOrderInfoRequestJsonBuilder;
import co.com.petstore.testing.utils.GenerateRandom;
import co.com.petstore.testing.utils.GetCurrent;
import com.google.gson.Gson;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.ORDER_INFORMATION;

public class CreateNewOrder implements Task {

    private final OrderInfo orderInfo;

    public CreateNewOrder(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    public static CreateNewOrder requestJson(OrderInfo orderInfo) {
        return Tasks.instrumented(CreateNewOrder.class, orderInfo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Gson gson = new Gson();
        boolean complete = true;
        if (orderInfo.getComplete().equals("false")) {
            complete = false;
        }

        AddOrderInfoRequestJson orderInfoRequest = new AddOrderInfoRequestJsonBuilder()
                .withOrderId(GenerateRandom.data(2))
                .andPetId(orderInfo.getPetId())
                .andQuantity(orderInfo.getQuantity())
                .andShipDate(GetCurrent.date())
                .andStatus(orderInfo.getStatus())
                .andComplete(complete)
                .build();

        String orderInfoRequestJson = gson
                .toJson(orderInfoRequest);
        actor.remember(ORDER_INFORMATION, orderInfoRequestJson);
    }
}
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
