package com.programmingsharing.springboottopics.conf;

import com.programmingsharing.springboottopics.quartz.DemoJob;
import com.programmingsharing.springboottopics.quartz.DemoJob1;
import com.programmingsharing.springboottopics.quartz.DemoJob2;
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
    public JobDetail demoJobDetail1() {
        return JobBuilder.newJob()
                .ofType(DemoJob1.class)
                .storeDurably()
                .withIdentity("PROGRAMMING_SHARING_QUARTZ_DEMO_1")
                .withDescription("This job use to demo how does quartz disallow concurrent execution")
                .build();
    }
    @Bean
    public JobDetail demoJobDetail2() {
        return JobBuilder.newJob()
                .ofType(DemoJob2.class)
                .storeDurably()
                .withIdentity("PROGRAMMING_SHARING_QUARTZ_DEMO_2")
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
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().repeatForever().withIntervalInMilliseconds(300).withMisfireHandlingInstructionFireNow())
                .build();
    }

    @Bean
    public Trigger demoJobTrigger1() {
        return TriggerBuilder
                .newTrigger()
                .forJob(demoJobDetail1())
                .withIdentity("PROGRAMMING_SHARING_QUARTZ_DEMO_TRIGGER_1")
                .withDescription("Trigger demo job")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().repeatForever().withIntervalInMilliseconds(300).withMisfireHandlingInstructionFireNow())
                .build();
    }

    @Bean
    public Trigger demoJobTrigger2() {
        return TriggerBuilder
                .newTrigger()
                .forJob(demoJobDetail2())
                .withIdentity("PROGRAMMING_SHARING_QUARTZ_DEMO_TRIGGER_2")
                .withDescription("Trigger demo job")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().repeatForever().withIntervalInMilliseconds(300).withMisfireHandlingInstructionFireNow())
                .build();
    }

}
