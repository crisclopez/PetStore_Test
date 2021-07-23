package co.com.petstore.testing.models;

import java.util.List;
import java.util.Map;

import static co.com.petstore.testing.utils.ConstantString.*;

public class PetInfo {

    private final String petId;
    private final String petName;
    private final String category;
    private final String photoUrl;
    private final String tag;
    private final String status;

    public PetInfo(List<Map<String, Object>> table) {
        String[] featureFields = {PET_ID_FIELD, NAME_FIELD, CATEGORY,
                PHOTO_URL, TAG, STATUS};
        String[] featureValues = new String[6];
        String[] emptyValues = {null, null, null, null, null, null};
        for (int i = 0; i <= 5; i++) {
            try {
                featureValues[i] = table.get(0).get(featureFields[i]).toString();
            } catch (Exception ex) {
                featureValues[i] = emptyValues[i];
            }
        }
        this.petId = featureValues[0];
        this.petName = featureValues[1];
        this.category = featureValues[2];
        this.photoUrl = featureValues[3];
        this.tag = featureValues[4];
        this.status = featureValues[5];
    }

    public String getPetId() {
        return petId;
    }

    public String getPetName() {
        return petName;
    }

    public String getCategory() {
        return category;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getTag() {
        return tag;
    }

    public String getStatus() {
        return status;
    }
}
