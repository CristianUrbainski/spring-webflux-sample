package br.com.urbainski.springwebfluxsample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundDocumentException extends RuntimeException {
}
