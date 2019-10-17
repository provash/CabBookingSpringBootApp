package com.pkd.interview.repos;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pkd.interview.models.BookedStatus;
import com.pkd.interview.models.Cab;
import com.pkd.interview.models.GeoLocation;
import com.pkd.interview.utils.TestingData;

@Repository
public class CabBookingRepoImpl implements CabBookingRepo {
  /**
   * This method needs to be implemented to fetch data from DB
   * @param location
   * @param bookedStatus
   * @return
   */
  @Override
  public List<Cab> getCabInfo(final GeoLocation location, final BookedStatus bookedStatus) {
        return Arrays.asList(TestingData.getMiniCabs(), TestingData.getSuvCabs());
  }

}
