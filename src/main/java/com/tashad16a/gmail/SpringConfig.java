package com.tashad16a.gmail;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by TashaD on 08.01.2021.
 */
@Configuration
@ComponentScan("com.tashad16a.gmail")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
