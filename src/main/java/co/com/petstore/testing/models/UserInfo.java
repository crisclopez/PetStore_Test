package co.com.petstore.testing.models;

import java.util.List;
import java.util.Map;

import static co.com.petstore.testing.utils.ConstantString.*;

public class UserInfo {

    private final String userName;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
    private final String phone;
    private final String userStatus;

    public UserInfo(List<Map<String, Object>> table) {

        String[] featureFields = {USER_NAME_FIELD, FIRST_NAME, LAST_NAME,
                EMAIL, PASSWORD, PHONE, USER_STATUS};
        String[] featureValues = new String[7];
        String[] emptyValues = {null, null, null, null, null, null, null};
        for (int i = 0; i <= 6; i++) {
            try {
                featureValues[i] = table.get(0).get(featureFields[i]).toString();
            } catch (Exception ex) {
                featureValues[i] = emptyValues[i];
            }
        }
        this.userName = featureValues[0];
        this.firstName = featureValues[1];
        this.lastName = featureValues[2];
        this.email = featureValues[3];
        this.password = featureValues[4];
        this.phone = featureValues[5];
        this.userStatus = featureValues[6];
    }

    public String getUserName() {
        return userName;
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
