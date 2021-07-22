package co.com.petstore.testing.models.builder;

import co.com.petstore.testing.models.AddOrderInfoRequestJson;

public class AddOrderInfoRequestJsonBuilder {

    String orderId;
    String petId;
    String quantity;
    String shipDate;
    String status;
    boolean complete;

    public AddOrderInfoRequestJsonBuilder withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public AddOrderInfoRequestJsonBuilder andPetId(String petId) {
        this.petId = petId;
        return this;
    }

    public AddOrderInfoRequestJsonBuilder andQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    public AddOrderInfoRequestJsonBuilder andShipDate(String shipDate) {
        this.shipDate = shipDate;
        return this;
    }

    public AddOrderInfoRequestJsonBuilder andStatus(String status) {
        this.status = status;
        return this;
    }

    public AddOrderInfoRequestJsonBuilder andComplete(boolean complete) {
        this.complete = complete;
        return this;
    }

    public AddOrderInfoRequestJson build() {
        return new AddOrderInfoRequestJson(this);
    }

    public String getOrderId() {
        return orderId;
    }

    public String getPetId() {
        return petId;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getShipDate() {
        return shipDate;
    }

    public String getStatus() {
        return status;
    }

    public boolean getComplete() {
        return complete;
    }
}
