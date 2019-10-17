package com.pkd.interview;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookingServiceApplicationStarter {
  private static final Logger LOGGER = LoggerFactory.getLogger(BookingServiceApplicationStarter.class);

  public static void main(String[] args) {
    LOGGER.info("Starting Booking service application");
    SpringApplication.run(BookingServiceApplicationStarter.class, args);
  }
/*

  @Bean
  public FilterRegistrationBean<LimitRequestFilter> abcFilter() {
    FilterRegistrationBean<LimitRequestFilter> filterRegBean = new FilterRegistrationBean<>();
    filterRegBean.setFilter(new LimitRequestFilter());
    filterRegBean.setOrder(Ordered.LOWEST_PRECEDENCE - 1);
    return filterRegBean;
  }
*/

}
