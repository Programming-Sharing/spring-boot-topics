package com.programmingsharing.springboottopics.conf;

import com.programmingsharing.springboottopics.quartz.DemoJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfiguration {

    @Bean
    public JobDetail demoJobDetail() {
        return JobBuilder.newJob()
                .ofType(DemoJob.class)
                .storeDurably()
                .withIdentity("PROGRAMMING_SHARING_QUARTZ_DEMO")
                .withDescription("This job use to demo how does quartz disallow concurrent execution")
                .build();
    }

    @Bean
    public Trigger demoJobTrigger() {
        return TriggerBuilder
                .newTrigger()
                .forJob(demoJobDetail())
                .withIdentity("PROGRAMMING_SHARING_QUARTZ_DEMO_TRIGGER")
                .withDescription("Trigger demo job")
                .withSchedule(SimpleScheduleBuilder.repeatSecondlyForever(5))
                .build();
    }

}
