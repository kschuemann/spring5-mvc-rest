package guru.springfamework.controller;

import guru.springfamework.service.RessourceNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice // invoced if there is a problem
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({RessourceNotFoundException.class}) // Handle alle Exceptions diesen Typs wie folgt ...
    public ResponseEntity<Object> handleNotFounException(Exception exception, WebRequest request) {
        return new ResponseEntity<Object>("Ressource Not Found", new HttpHeaders(), HttpStatus.NOT_FOUND);
    }


}
