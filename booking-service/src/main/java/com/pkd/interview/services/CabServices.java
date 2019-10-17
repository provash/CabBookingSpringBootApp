

package com.pkd.interview.services;

import com.pkd.interview.dto.CabResponse;
import com.pkd.interview.models.GeoLocation;

public interface CabServices {
  CabResponse getCabs(GeoLocation currentLocation);
}
