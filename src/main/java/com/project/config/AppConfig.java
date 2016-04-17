package com.project.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(EhcacheConfig.class)
@Configuration
@ComponentScan("com.project")
public class AppConfig {


}
