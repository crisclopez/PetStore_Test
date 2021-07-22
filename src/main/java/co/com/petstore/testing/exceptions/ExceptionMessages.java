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
}