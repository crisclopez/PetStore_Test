package co.com.petstore.testing.models.builder;

import co.com.petstore.testing.models.CreateUserRequestJson;

public class CreateUserRequestJsonBuilder {

    String id;
    String username;
    String firstName;
    String lastName;
    String email;
    String password;
    String phone;
    String userStatus;

    public CreateUserRequestJsonBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public CreateUserRequestJsonBuilder andUserName(String username) {
        this.username = username;
        return this;
    }

    public CreateUserRequestJsonBuilder andFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CreateUserRequestJsonBuilder andLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CreateUserRequestJsonBuilder andEmail(String email) {
        this.email = email;
        return this;
    }

    public CreateUserRequestJsonBuilder andPassword(String password) {
        this.password = password;
        return this;
    }

    public CreateUserRequestJsonBuilder andPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public CreateUserRequestJsonBuilder andUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public CreateUserRequestJson build() {
        return new CreateUserRequestJson(this);
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getUserStatus() {
        return userStatus;
    }
}
