package com.tsr.profile;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/tsr/profile/common-dev.properties")
@Profile("dev")
public class DevConfig {

}
