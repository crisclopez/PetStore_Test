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
