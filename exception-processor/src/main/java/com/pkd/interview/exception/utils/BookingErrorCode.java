

package com.pkd.interview.exception.utils;

public enum BookingErrorCode {
  GENERIC_ERROR(500), NO_RECORD(100);
  private final int errorCode;

  BookingErrorCode(final int errorCode) {
    this.errorCode = errorCode;
  }

  int getErrorCode() {
    return errorCode;
  }

  @Override
  public String toString() {
    return "BookingAppErrorCode{" + "errorCode=" + errorCode + "} " + super.toString();
  }
}
