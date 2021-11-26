package com.dadavivi.aliyunipv6ddns.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTask {

    private final DDNS ddns;

    public ScheduleTask(DDNS ddns) {
        this.ddns = ddns;
    }

    @Scheduled(fixedRate = 600000)
    public void task() {
        ddns.ddns();
    }

}
