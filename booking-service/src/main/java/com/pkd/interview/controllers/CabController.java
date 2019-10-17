package com.pkd.interview.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pkd.interview.dto.CabResponse;
import com.pkd.interview.services.CabServices;
import com.pkd.interview.utils.BookingManagerServiceUtils;

@RestController
@RequestMapping(path = "/api/v1/cab")
public class CabController {

  private final CabServices cabServices;

  public CabController(final CabServices cabServices) {
    this.cabServices = cabServices;
  }

  @GetMapping(path = "/", produces = "application/json")
  public CabResponse getCabs(final @RequestParam("currentLocation") String currentLocationBase64Encoded) {

    return cabServices.getCabs(BookingManagerServiceUtils.getDecodeGeoLocation(currentLocationBase64Encoded));
  }
}
