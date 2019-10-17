
package com.pkd.interview.services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.pkd.interview.dto.CabResponse;
import com.pkd.interview.models.BookedStatus;
import com.pkd.interview.models.Cab;
import com.pkd.interview.models.GeoLocation;
import com.pkd.interview.repos.CabBookingRepo;

@Service
public class CabServicesImpl implements CabServices {

  private final CabBookingRepo cabBookingRepo;

  public CabServicesImpl(final CabBookingRepo cabBookingRepo) {
    this.cabBookingRepo = cabBookingRepo;
  }

  @Override
  public CabResponse getCabs(final GeoLocation currentLocation) {
    final Map<BookedStatus, List<Cab>> bookedStatusListMap = new HashMap<>();
    Arrays.stream(BookedStatus.values())
        .forEach(bookedStatus -> bookedStatusListMap.put(bookedStatus,
            cabBookingRepo.getCabInfo(currentLocation, bookedStatus)));
    return new CabResponse(bookedStatusListMap);
  }
}
