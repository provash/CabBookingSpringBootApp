package com.pkd.interview.services;

import java.util.List;

import com.pkd.interview.dto.FareResponse;
import com.pkd.interview.models.CabBooking;
import com.pkd.interview.models.CarType;
import com.pkd.interview.models.GeoLocation;
import com.pkd.interview.models.RideType;
import com.pkd.interview.models.User;

public interface CabBookingServices {

  FareResponse getFare(GeoLocation startingPoint, GeoLocation endingPoint, CarType carType, RideType rideType);

  List<CabBooking> getCabBookings(final long fromDateInMillis, final long toInMillis, CarType carType, User user);
}
