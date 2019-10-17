package com.pkd.interview.services;

import org.springframework.stereotype.Service;

import com.pkd.interview.models.DistanceTime;
import com.pkd.interview.models.GeoLocation;
@Service
public class DistanceCalculator {

  public DistanceTime getDistanceTime(final GeoLocation startingPoint, final GeoLocation endingPoint) {

    return new DistanceTime(calculateTime(startingPoint, endingPoint), calculateDistance(startingPoint, endingPoint));
  }

  private Long calculateTime(final GeoLocation startingPoint, final GeoLocation endingPoint) {
    return null;
  }

  private Long calculateDistance(final GeoLocation startingPoint, final GeoLocation endingPoint) {
    return null;
  }

}
