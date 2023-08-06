package com.tsr.Import;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {ServiceConfig.class,DAOConfig.class})
public class JavaConfigMain {

}
