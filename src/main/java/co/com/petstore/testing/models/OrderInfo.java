package co.com.petstore.testing.models;

import java.util.List;
import java.util.Map;

import static co.com.petstore.testing.utils.ConstantString.*;

public class OrderInfo {

    private final String petId;
    private final String quantity;
    private final String status;
    private final String complete;

    public OrderInfo(List<Map<String, Object>> table) {

        String[] featureFields = {PET_ID_FIELD, QUANTITY, STATUS,
                COMPLETE};
        String[] featureValues = new String[4];
        String[] emptyValues = {null, null, null, null};
        for (int i = 0; i <= 3; i++) {
            try {
                featureValues[i] = table.get(0).get(featureFields[i]).toString();
            } catch (Exception ex) {
                featureValues[i] = emptyValues[i];
            }
        }
        this.petId = featureValues[0];
        this.quantity = featureValues[1];
        this.status = featureValues[2];
        this.complete = featureValues[3];
    }

    public String getPetId() {
        return petId;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getStatus() {
        return status;
    }

    public String getComplete() {
        return complete;
    }
}
