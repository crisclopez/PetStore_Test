package co.com.petstore.testing.tasks;

import co.com.petstore.testing.models.CategoryInfo;
import co.com.petstore.testing.models.PetInfo;
import co.com.petstore.testing.models.AddPetInfoRequestJson;
import co.com.petstore.testing.models.TagsInfo;
import co.com.petstore.testing.models.builder.CategoryInfoBuilder;
import co.com.petstore.testing.models.builder.AddPetInformationRequestJsonBuilder;
import co.com.petstore.testing.models.builder.TagsInfoBuilder;
import co.com.petstore.testing.utils.GenerateRandom;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Collections;

import static co.com.petstore.testing.utils.ConstantString.PET_INFORMATION;

public class CreateUpdatePet implements Task {

    private final PetInfo petInfo;

    public CreateUpdatePet(PetInfo petInfo) {
        this.petInfo = petInfo;
    }

    public static CreateUpdatePet requestJson(PetInfo petInfo) {
        return Tasks.instrumented(CreateUpdatePet.class, petInfo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Gson gson = new Gson();

        CategoryInfo categoryInfo = new CategoryInfoBuilder()
                .withCategoryId(GenerateRandom.data(1))
                .andCategoryName(petInfo.getCategory())
                .build();

        JsonArray photoUrlJsonArray = new JsonArray();
        photoUrlJsonArray.add(petInfo.getPhotoUrl());

        TagsInfo tagInfo = new TagsInfoBuilder()
                .withTagId(GenerateRandom.data(1))
                .andTagName(petInfo.getTag())
                .build();

        AddPetInfoRequestJson petInformationJson = new AddPetInformationRequestJsonBuilder()
                .withPetId(petInfo.getPetId())
                .andPetName(petInfo.getPetName())
                .andCategoryInfo(categoryInfo)
                .andPhotoUrl(photoUrlJsonArray)
                .andTagInfo(Collections.singletonList(tagInfo))
                .andStatus(petInfo.getStatus())
                .build();

        String petInformationRequestJson = gson
                .toJson(petInformationJson);
        actor.remember(PET_INFORMATION, petInformationRequestJson);
    }
}
