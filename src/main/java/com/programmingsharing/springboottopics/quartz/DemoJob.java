package com.programmingsharing.springboottopics.quartz;


import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.time.Instant;

@DisallowConcurrentExecution
public class DemoJob extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext context) {
        System.out.println("job run at: " + Instant.now().toString());
    }
}
