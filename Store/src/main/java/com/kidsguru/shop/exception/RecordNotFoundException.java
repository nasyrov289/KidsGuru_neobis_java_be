package com.kidsguru.shop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Record not found")
public class RecordNotFoundException extends Exception {
    // used to tell the controller when to return error messages
}
