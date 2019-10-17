package com.pkd.interview.controllers;

import static com.pkd.interview.utils.BookingManagerServiceUtils.getDecodeGeoLocation;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pkd.interview.dto.FareResponse;
import com.pkd.interview.models.CabBooking;
import com.pkd.interview.models.CarType;
import com.pkd.interview.models.RideType;
import com.pkd.interview.models.User;
import com.pkd.interview.services.CabBookingServices;

@RestController
@RequestMapping(path = "/api/v1/booking")
public class BookingController {

  private final CabBookingServices cabBookingServices;

  public BookingController(final CabBookingServices cabBookingServices) {
    this.cabBookingServices = cabBookingServices;
  }

  @GetMapping(path = "/", produces = "application/json")
  public FareResponse fetchFare(final @RequestParam("startingPoint") String startingPoint,
                                final @RequestParam("endingPoint") String endingPoint,
                                final @RequestParam("carType") CarType carType,
                                final @RequestParam("rideType") RideType rideType) {
    return cabBookingServices.getFare(getDecodeGeoLocation(startingPoint), getDecodeGeoLocation(endingPoint), carType, rideType);
  }

  @GetMapping(path = "/statistics", produces = "application/json")
  public List<CabBooking> getTotalNumberOfBooking(@RequestParam("fromDate") final long fromDateInMillis,
                                                  @RequestParam("toDate") final long toDateInMillis,
                                                  @RequestParam("carType") CarType carType) {
    //User info will be populated based on authentication
    final User user = new User();
    return cabBookingServices.getCabBookings(fromDateInMillis, toDateInMillis, carType, user);
  }
}
