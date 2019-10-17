package com.pkd.interview.utils;

import java.util.Random;

import com.pkd.interview.models.Cab;
import com.pkd.interview.models.CabAgency;
import com.pkd.interview.models.CarType;

public class TestingData {
  private static Random random = new Random();

  public static Cab getMiniCabs() {
    Cab cab = new Cab();
    cab.setCabId(random.nextInt() + "'");
    cab.setCabAgency(new CabAgency("testAgency1", "tesrtAgencyDetails"));
    cab.setCarType(CarType.MINI);
    return cab;
  }

  public static Cab getSuvCabs() {
    Cab cab = new Cab();
    cab.setCabId(random.nextInt() + "'");
    cab.setCabAgency(new CabAgency("testAgency1", "tesrtAgencyDetails"));
    cab.setCarType(CarType.SUV);
    return cab;
  }
}
