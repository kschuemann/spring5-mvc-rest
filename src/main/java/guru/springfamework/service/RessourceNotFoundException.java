package guru.springfamework.service;

public class RessourceNotFoundException extends RuntimeException {


    public RessourceNotFoundException() {
    }

    public RessourceNotFoundException(String message) {
        super(message);
    }

    public RessourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public RessourceNotFoundException(Throwable cause) {
        super(cause);
    }

    public RessourceNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
