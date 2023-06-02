package com.nexer.nexer2.log;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class LogService {

    private final LogRepository logRepository;

    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }


    public List<Log> getLogs() {

        return logRepository.findAll();
    }


    public void generateLog() {

        Log log  = new Log();
        log.setTimestamp(LocalDateTime.now());

        logRepository.save(log);
    }

}
