<<<<<<< HEAD
package co.com.petstore.testing.exceptions;

public enum ExceptionMessages {
    JSON_NOT_RESPONSE("The service: %s is down and did not respond a json, error %s");

    private final String message;

    ExceptionMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
=======
package co.com.petstore.testing.exceptions;

public enum ExceptionMessages {
    JSON_NOT_RESPONSE("The service: %s is down and did not respond a json, error %s");

    private final String message;

    ExceptionMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
}