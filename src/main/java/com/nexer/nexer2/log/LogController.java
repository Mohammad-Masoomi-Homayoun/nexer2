package com.nexer.nexer2.log;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class LogController {

    private final LogService logService;
    private final LogMapper logMapper;

    public LogController(LogService logService, LogMapper logMapper) {
        this.logService = logService;
        this.logMapper = logMapper;
    }

    @GetMapping
    public List<LogDto> getLogs() {

        return logMapper.logDtoList(logService.getLogs());

    }

    @GetMapping("generate")
    public void startGenerating() {
        LogGenerator logGenerator = new LogGenerator(logService);
        Thread myThread = new Thread(logGenerator);
        myThread.start();
        return;
    }

}
