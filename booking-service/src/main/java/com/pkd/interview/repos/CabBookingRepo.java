
package com.pkd.interview.repos;

import java.util.List;

import com.pkd.interview.models.BookedStatus;
import com.pkd.interview.models.Cab;
import com.pkd.interview.models.GeoLocation;

public interface CabBookingRepo {
    List<Cab> getCabInfo(GeoLocation location, BookedStatus bookedStatus);
}
