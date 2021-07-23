<<<<<<< HEAD
package co.com.petstore.testing.models;

import co.com.petstore.testing.models.builder.AddOrderInfoRequestJsonBuilder;

public class AddOrderInfoRequestJson {

    String id;
    String petId;
    String quantity;
    String shipDate;
    String status;
    boolean complete;

    public AddOrderInfoRequestJson(AddOrderInfoRequestJsonBuilder addOrderInfoRequestJsonBuilder) {
        this.id = addOrderInfoRequestJsonBuilder.getOrderId();
        this.petId = addOrderInfoRequestJsonBuilder.getPetId();
        this.quantity = addOrderInfoRequestJsonBuilder.getQuantity();
        this.shipDate = addOrderInfoRequestJsonBuilder.getShipDate();
        this.status = addOrderInfoRequestJsonBuilder.getStatus();
        this.complete = addOrderInfoRequestJsonBuilder.getComplete();
    }
}
=======
package co.com.petstore.testing.models;

import co.com.petstore.testing.models.builder.AddOrderInfoRequestJsonBuilder;

public class AddOrderInfoRequestJson {

    String id;
    String petId;
    String quantity;
    String shipDate;
    String status;
    boolean complete;

    public AddOrderInfoRequestJson(AddOrderInfoRequestJsonBuilder addOrderInfoRequestJsonBuilder) {
        this.id = addOrderInfoRequestJsonBuilder.getOrderId();
        this.petId = addOrderInfoRequestJsonBuilder.getPetId();
        this.quantity = addOrderInfoRequestJsonBuilder.getQuantity();
        this.shipDate = addOrderInfoRequestJsonBuilder.getShipDate();
        this.status = addOrderInfoRequestJsonBuilder.getStatus();
        this.complete = addOrderInfoRequestJsonBuilder.getComplete();
    }
}
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
