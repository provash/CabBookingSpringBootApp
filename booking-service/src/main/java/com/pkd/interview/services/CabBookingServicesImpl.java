package com.pkd.interview.services;

import java.time.Instant;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pkd.interview.dto.FareResponse;
import com.pkd.interview.models.CabBooking;
import com.pkd.interview.models.CarType;
import com.pkd.interview.models.GeoLocation;
import com.pkd.interview.models.RideType;
import com.pkd.interview.models.User;
import com.pkd.interview.repos.CabBookingRepo;

@Service
public class CabBookingServicesImpl implements CabBookingServices {
  private final CabBookingRepo cabBookingRepo;
  private final FareCalculator fareCalculator;

  public CabBookingServicesImpl(final CabBookingRepo cabBookingRepo, final FareCalculator fareCalculator) {
    this.cabBookingRepo = cabBookingRepo;
    this.fareCalculator = fareCalculator;
  }



  @Override
  public FareResponse getFare(final GeoLocation startingPoint,
                              final GeoLocation endingPoint,
                              final CarType carType,
                              final RideType rideType) {

    final Double fare = fareCalculator.getFare(startingPoint, endingPoint, carType, rideType);
    return new FareResponse(carType, fare, Instant.now());
  }

  @Override
  public List<CabBooking> getCabBookings(final long fromDateInMillis,
                                         final long toInMillis,
                                         final CarType carType,
                                         final User user) {
    return null;
  }
}
