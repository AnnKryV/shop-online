package org.example.app.exceptions;

import java.util.HashMap;
import java.util.Map;

public class EmployeeCreateException extends Throwable {

    Map<String, String> errors;

    public EmployeeCreateException(String message, Map<String, String> errors){
        super(message);
        this.errors = errors;
    }

    public String getErrors(Map<String, String> errors){

        this.errors = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        errors.forEach((key, value) ->
                stringBuilder.append("\n>> ")
                        .append(key)
                        .append(": ")
                        .append(value));

        return stringBuilder.toString();
    }
}
