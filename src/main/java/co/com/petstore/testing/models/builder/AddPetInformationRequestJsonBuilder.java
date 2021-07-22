package co.com.petstore.testing.models.builder;

import co.com.petstore.testing.models.CategoryInfo;
import co.com.petstore.testing.models.AddPetInfoRequestJson;
import co.com.petstore.testing.models.TagsInfo;
import com.google.gson.JsonArray;

import java.util.List;

public class AddPetInformationRequestJsonBuilder {

    String petId;
    String petName;
    CategoryInfo categoryInfo;
    JsonArray photoUrl;
    List<TagsInfo> tagInfo;
    String status;

    public AddPetInformationRequestJsonBuilder withPetId(String petId) {
        this.petId = petId;
        return this;
    }

    public AddPetInformationRequestJsonBuilder andPetName(String petName) {
        this.petName = petName;
        return this;
    }

    public AddPetInformationRequestJsonBuilder andCategoryInfo(CategoryInfo categoryInfo) {
        this.categoryInfo = categoryInfo;
        return this;
    }


    public AddPetInformationRequestJsonBuilder andPhotoUrl(JsonArray photoUrl) {
        this.photoUrl = photoUrl;
        return this;
    }

    public AddPetInformationRequestJsonBuilder andTagInfo(List<TagsInfo> tagInfo) {
        this.tagInfo = tagInfo;
        return this;
    }


    public AddPetInformationRequestJsonBuilder andStatus(String status) {
        this.status = status;
        return this;
    }

    public AddPetInfoRequestJson build() {
        return new AddPetInfoRequestJson(this);
    }

    public String getPetId() {
        return petId;
    }

    public String getPetName() {
        return petName;
    }

    public CategoryInfo getCategoryInfo() {
        return categoryInfo;
    }

    public JsonArray getPhotoUrl() {
        return photoUrl;
    }

    public List<TagsInfo> getTagInfo() {
        return tagInfo;
    }

    public String getStatus() {
        return status;
    }
}
