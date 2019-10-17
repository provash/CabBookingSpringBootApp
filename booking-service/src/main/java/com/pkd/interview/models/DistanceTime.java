
package com.pkd.interview.models;

public class DistanceTime {
  private final  Long timeDuration;
  private final Long distance;

  public DistanceTime(final  Long timeDuration,final Long distance){
    this.timeDuration = timeDuration;
    this.distance = distance;
  }

  public Long getTimeDuration() {
    return timeDuration;
  }

  public Long getDistance() {
    return distance;
  }
}
