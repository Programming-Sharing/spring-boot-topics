package com.programmingsharing.springboottopics.quartz;


import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.time.Instant;

@DisallowConcurrentExecution
public class DemoJob1 extends QuartzJobBean {

    @Value("${spring.test:${spring.datasource.driver-class-name}}")
    private String testValueInjectTrick;

    @Override
    protected void executeInternal(JobExecutionContext context) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.getClass().getName() + " job run at: " + Instant.now().toString());
    }
}
