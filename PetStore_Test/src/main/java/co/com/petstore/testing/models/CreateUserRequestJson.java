<<<<<<< HEAD
package co.com.petstore.testing.models;

import co.com.petstore.testing.models.builder.CreateUserRequestJsonBuilder;

public class CreateUserRequestJson {

    String id;
    String username;
    String firstName;
    String lastName;
    String email;
    String password;
    String phone;
    String userStatus;

    public CreateUserRequestJson(CreateUserRequestJsonBuilder createUserRequestJsonBuilder) {
        this.id = createUserRequestJsonBuilder.getId();
        this.username = createUserRequestJsonBuilder.getUserName();
        this.firstName = createUserRequestJsonBuilder.getFirstName();
        this.lastName = createUserRequestJsonBuilder.getLastName();
        this.email = createUserRequestJsonBuilder.getEmail();
        this.password = createUserRequestJsonBuilder.getPassword();
        this.phone = createUserRequestJsonBuilder.getPhone();
        this.userStatus = createUserRequestJsonBuilder.getUserStatus();
    }
}
=======
package co.com.petstore.testing.models;

import co.com.petstore.testing.models.builder.CreateUserRequestJsonBuilder;

public class CreateUserRequestJson {

    String id;
    String username;
    String firstName;
    String lastName;
    String email;
    String password;
    String phone;
    String userStatus;

    public CreateUserRequestJson(CreateUserRequestJsonBuilder createUserRequestJsonBuilder) {
        this.id = createUserRequestJsonBuilder.getId();
        this.username = createUserRequestJsonBuilder.getUserName();
        this.firstName = createUserRequestJsonBuilder.getFirstName();
        this.lastName = createUserRequestJsonBuilder.getLastName();
        this.email = createUserRequestJsonBuilder.getEmail();
        this.password = createUserRequestJsonBuilder.getPassword();
        this.phone = createUserRequestJsonBuilder.getPhone();
        this.userStatus = createUserRequestJsonBuilder.getUserStatus();
    }
}
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
