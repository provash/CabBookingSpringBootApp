

package com.pkd.interview.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pkd.interview.dto.CabResponse;
import com.pkd.interview.models.BookedStatus;
import com.pkd.interview.models.Cab;
import com.pkd.interview.models.GeoLocation;
import com.pkd.interview.services.CabServices;
import com.pkd.interview.utils.TestingData;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CabControllerTest {
  @Autowired
  private MockMvc mockMvc;
  ObjectMapper objectMapper = new ObjectMapper();
  @MockBean
  private CabServices cabServices;
  @MockBean
  private GeoLocation currentLocation;

  @Test
  public void getCabs_() throws Exception {
    final Map<BookedStatus, List<Cab>> bookedStatusListMap = new HashMap<>();
    bookedStatusListMap.put(BookedStatus.AVAILABLE, Collections.singletonList(TestingData.getMiniCabs()));
    bookedStatusListMap.put(BookedStatus.AVAILABLE, Collections.singletonList(TestingData.getSuvCabs()));
    CabResponse actualCabResponse = new CabResponse(bookedStatusListMap);
    final String expectedResp = objectMapper.writeValueAsString(actualCabResponse);
    System.out.println("expectedResp ::"+expectedResp);
    Mockito.doReturn( actualCabResponse).when(cabServices).getCabs(Mockito.any(GeoLocation.class));
    this.mockMvc.perform(get("/api/v1/cab/?currentLocation=1213424"))
        .andExpect(status().isOk())
        .andExpect(content().json(expectedResp));
  }

}