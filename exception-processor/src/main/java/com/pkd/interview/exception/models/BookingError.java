
package com.pkd.interview.exception.models;

import com.pkd.interview.exception.utils.BookingErrorCode;

public class BookingError {
  private BookingErrorCode errorCode;
  private String message;

  BookingError() {
    this(null, null);
  }

  public BookingError(final BookingErrorCode errorCode, final String message) {
    this.errorCode = errorCode;
    this.message = message;
  }

  public BookingErrorCode getCode() {
    return errorCode;
  }

  public void setCode(final BookingErrorCode errorCode) {
    this.errorCode = errorCode;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(final String message) {
    this.message = message;
  }
}
