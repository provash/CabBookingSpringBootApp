

package com.pkd.interview.services;

import org.springframework.stereotype.Service;

import com.pkd.interview.models.CarType;
import com.pkd.interview.models.DistanceTime;
import com.pkd.interview.models.GeoLocation;
import com.pkd.interview.models.RideType;

@Service
public class FareCalculator {
  private final DistanceCalculator distanceCalculator;

  public FareCalculator(final DistanceCalculator distanceCalculator){
    this.distanceCalculator = distanceCalculator;
  }

  public  Double getFare(final GeoLocation startingPoint,
                         final GeoLocation endingPoint,
                         final CarType carType,
                         final RideType rideTyp){

    final DistanceTime distanceTime = distanceCalculator.getDistanceTime(startingPoint,endingPoint);

    return  null;
  }

}
