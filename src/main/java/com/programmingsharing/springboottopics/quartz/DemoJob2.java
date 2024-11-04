package com.programmingsharing.springboottopics.quartz;


import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.time.Instant;

@DisallowConcurrentExecution
public class DemoJob2 extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext context) {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(this.getClass().getName() + " job run at: " + Instant.now().toString());
    }
}
