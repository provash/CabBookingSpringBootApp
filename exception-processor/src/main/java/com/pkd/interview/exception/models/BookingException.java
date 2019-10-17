

package com.pkd.interview.exception.models;

import com.pkd.interview.exception.utils.BookingErrorCode;

public class BookingException extends RuntimeException {
  private BookingErrorCode code;

  public BookingException(final Throwable e, String message, BookingErrorCode code) {
    super(message, e);
    this.code = code;
  }

  public BookingException(String message, BookingErrorCode code) {
    super(message);
    this.code = code;
  }

  public void setCode(final BookingErrorCode code) {
    this.code = code;
  }

  public BookingErrorCode getCode() {
    return code;
  }

}
