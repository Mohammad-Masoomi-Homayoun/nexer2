package com.nexer.nexer2.log;

import org.springframework.stereotype.Component;

@Component
public class LogGenerator implements Runnable {

    private final LogService logService;

    public LogGenerator(LogService logService) {
        this.logService = logService;
    }

    @Override
    public void run() {

        while (true) {
            logService.generateLog();
            try {
                Thread.sleep(10_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
