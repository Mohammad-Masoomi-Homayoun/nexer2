package com.nexer.nexer2.log;


import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LogMapper {

    public LogDto toDto(Log log) {

        if(log == null)
            return null;

        LogDto logDto  = LogDto.builder()
                .id(log.getId())
                .timestamp(log.getTimestamp())
                .build();

        return logDto;
    }

    public List<LogDto> logDtoList(List<Log> logs) {

        return logs.stream().map(l -> this.toDto(l)).collect(Collectors.toList());
    }
}
