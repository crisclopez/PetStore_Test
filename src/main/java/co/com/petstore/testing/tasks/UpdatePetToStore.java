package co.com.petstore.testing.tasks;

import co.com.petstore.testing.interactions.SendRequest;
import co.com.petstore.testing.models.PetInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.petstore.testing.utils.ConstantString.*;

public class UpdatePetToStore implements Task {

    private final PetInfo petInfo;

    public UpdatePetToStore(PetInfo petInfo) {
        this.petInfo = petInfo;
    }

    public static UpdatePetToStore inventoryWithNextData(PetInfo petInfo) {
        return Tasks.instrumented(UpdatePetToStore.class, petInfo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CreateUpdatePet.requestJson(petInfo));
        actor.attemptsTo(
                SendRequest.toService(SERVICE_ENDPOINT
                        , "pet/"
                        , actor.recall(PET_INFORMATION)
                        , PUT)
        );
        actor.remember(PET_NAME, petInfo.getPetName());
    }
}
