
package com.pkd.interview.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pkd.interview.models.BookedStatus;
import com.pkd.interview.models.Cab;

public class CabResponse {
  private final Map<BookedStatus, List<Cab>> cabs = new HashMap<>();

  public CabResponse(final Map<BookedStatus, List<Cab>> cabs){
    cabs.putAll(cabs);
  }

  public Map<BookedStatus, List<Cab>> getCabs() {
    return cabs;
  }
}
