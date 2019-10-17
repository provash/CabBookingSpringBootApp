
package com.pkd.interview.models;

public class GeoLocation {
  private final Long latitude;
  private final Long longitude;

  public GeoLocation() {
    this(null, null);
  }

  public GeoLocation(final Long latitude, final Long longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof GeoLocation)) {
      return false;
    }

    final GeoLocation that = (GeoLocation) o;

    if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) {
      return false;
    }
    return longitude != null ? longitude.equals(that.longitude) : that.longitude == null;

  }

  @Override
  public int hashCode() {
    int result = latitude != null ? latitude.hashCode() : 0;
    result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "GeoLocation{" + "latitude=" + latitude + ", longitude=" + longitude + '}';
  }
}
