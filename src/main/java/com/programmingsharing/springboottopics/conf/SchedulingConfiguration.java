package com.programmingsharing.springboottopics.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

@Configuration
@EnableScheduling
public class SchedulingConfiguration implements SchedulingConfigurer {

    @Value("${scheduling.greet}")
    private String greetCronExpression;
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.addCronTask(greet(), greetCronExpression);
    }

    @Bean
    public Runnable greet() {
        return () -> System.out.println("Hello, this message come from scheduled tasks");
    }
}
