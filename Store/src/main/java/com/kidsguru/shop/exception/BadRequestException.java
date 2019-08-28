package com.kidsguru.shop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Bad request parameters")
public class BadRequestException extends Exception {
    // used to tell the controller when to return error messages
}
