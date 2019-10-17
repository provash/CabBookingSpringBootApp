package com.pkd.interview.models;

public class CabAgency {
  private String agencyId;
  private String agencyDetails;

  CabAgency() {
    this(null, null);
  }

  public CabAgency(final String agencyId, final String agencyDetails) {
    this.agencyId = agencyId;
    this.agencyDetails = agencyDetails;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof CabAgency)) {
      return false;
    }

    final CabAgency cabAgency = (CabAgency) o;

    if (agencyId != null ? !agencyId.equals(cabAgency.agencyId) : cabAgency.agencyId != null) {
      return false;
    }
    return agencyDetails != null ? agencyDetails.equals(cabAgency.agencyDetails) : cabAgency.agencyDetails == null;

  }

  @Override
  public int hashCode() {
    int result = agencyId != null ? agencyId.hashCode() : 0;
    result = 31 * result + (agencyDetails != null ? agencyDetails.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "CabAgency{" + "agencyId='" + agencyId + '\'' + ", agencyDetails='" + agencyDetails + '\'' + '}';
  }
}
