package co.com.petstore.testing.models;

import co.com.petstore.testing.models.builder.AddPetInformationRequestJsonBuilder;
import com.google.gson.JsonArray;

import java.util.List;

public class AddPetInfoRequestJson {

    String id;
    String name;
    CategoryInfo category;
    JsonArray photoUrl;
    List<TagsInfo> tags;
    String status;

    public AddPetInfoRequestJson(AddPetInformationRequestJsonBuilder addPetInformationRequestJsonBuilder) {
        this.id = addPetInformationRequestJsonBuilder.getPetId();
        this.name = addPetInformationRequestJsonBuilder.getPetName();
        this.category = addPetInformationRequestJsonBuilder.getCategoryInfo();
        this.photoUrl = addPetInformationRequestJsonBuilder.getPhotoUrl();
        this.tags = addPetInformationRequestJsonBuilder.getTagInfo();
        this.status = addPetInformationRequestJsonBuilder.getStatus();
    }
}
