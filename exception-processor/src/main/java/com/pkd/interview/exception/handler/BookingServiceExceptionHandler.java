

package com.pkd.interview.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.pkd.interview.exception.models.BookingError;
import com.pkd.interview.exception.models.BookingException;
import com.pkd.interview.exception.utils.BookingErrorCode;

@SuppressWarnings({"unchecked", "rawtypes"})
@RestControllerAdvice
public class BookingServiceExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(Exception.class)
  public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
    BookingError error = new BookingError(BookingErrorCode.GENERIC_ERROR, ex.getMessage());
    return new ResponseEntity(error, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(BookingException.class)
  public final ResponseEntity<Object> handleBookingExceptions(BookingException ex, WebRequest request) {
    BookingError error = new BookingError(ex.getCode(), ex.getMessage());
    return new ResponseEntity(error, HttpStatus.BAD_REQUEST);
  }

}

