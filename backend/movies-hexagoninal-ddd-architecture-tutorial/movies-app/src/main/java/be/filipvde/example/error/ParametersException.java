package be.filipvde.example.error;

public class ParametersException extends RuntimeException {
    public ParametersException(String message) {
        super(message);
    }
}