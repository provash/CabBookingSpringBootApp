
package com.pkd.interview.dto;

import java.time.Instant;

import com.pkd.interview.models.CarType;

public class FareResponse {
  private final CarType carType;
  private final Double estimatedFare;
  private final Instant currentDateTime;

  public FareResponse(final CarType carType, final Double estimatedFare, final Instant currentDateTime) {
    this.carType = carType;
    this.estimatedFare = estimatedFare;
    this.currentDateTime = currentDateTime;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof FareResponse)) {
      return false;
    }

    final FareResponse that = (FareResponse) o;

    if (carType != that.carType) {
      return false;
    }
    if (estimatedFare != null ? !estimatedFare.equals(that.estimatedFare) : that.estimatedFare != null) {
      return false;
    }
    return currentDateTime != null ? currentDateTime.equals(that.currentDateTime) : that.currentDateTime == null;

  }

  @Override
  public int hashCode() {
    int result = carType != null ? carType.hashCode() : 0;
    result = 31 * result + (estimatedFare != null ? estimatedFare.hashCode() : 0);
    result = 31 * result + (currentDateTime != null ? currentDateTime.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "FareResponse{" + "carType=" + carType + ", estimatedFare=" + estimatedFare + ", currentDateTime="
        + currentDateTime + '}';
  }
}
