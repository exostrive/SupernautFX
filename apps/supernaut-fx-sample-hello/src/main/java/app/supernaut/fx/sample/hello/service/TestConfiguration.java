package app.supernaut.fx.sample.hello.service;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties(TestConfiguration.PREFIX)
public class TestConfiguration {
    public static final String PREFIX = "test";

   String title;

   public String getTitle() {
       return title;
   }
}
