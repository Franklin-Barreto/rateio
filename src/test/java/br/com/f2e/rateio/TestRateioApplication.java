package br.com.f2e.rateio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestRateioApplication {

  public static void main(String[] args) {
    SpringApplication.from(RateioApplication::main).with(TestRateioApplication.class).run(args);
  }

}
