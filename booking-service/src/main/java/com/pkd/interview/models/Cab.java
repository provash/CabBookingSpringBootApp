
package com.pkd.interview.models;

public class Cab {
  private String cabId;
  private CarType carType;
  private CabAgency cabAgency;

  public String getCabId() {
    return cabId;
  }

  public void setCabId(final String cabId) {
    this.cabId = cabId;
  }

  public CarType getCarType() {
    return carType;
  }

  public void setCarType(final CarType carType) {
    this.carType = carType;
  }

  public CabAgency getCabAgency() {
    return cabAgency;
  }

  public void setCabAgency(final CabAgency cabAgency) {
    this.cabAgency = cabAgency;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Cab)) {
      return false;
    }

    final Cab cab = (Cab) o;

    if (cabId != null ? !cabId.equals(cab.cabId) : cab.cabId != null) {
      return false;
    }
    if (carType != cab.carType) {
      return false;
    }
    return cabAgency != null ? cabAgency.equals(cab.cabAgency) : cab.cabAgency == null;

  }

  @Override
  public int hashCode() {
    int result = cabId != null ? cabId.hashCode() : 0;
    result = 31 * result + (carType != null ? carType.hashCode() : 0);
    result = 31 * result + (cabAgency != null ? cabAgency.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Cab{" + "cabId='" + cabId + '\'' + ", carType=" + carType + ", cabAgency=" + cabAgency + '}';
  }
}
