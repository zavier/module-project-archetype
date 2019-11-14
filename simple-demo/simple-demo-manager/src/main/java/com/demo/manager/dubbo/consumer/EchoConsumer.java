package com.demo.manager.dubbo.consumer;

import com.demo.api.TimeServer;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class EchoConsumer {

    @Reference
    private TimeServer timeServer;

    public String getTime(String format) {
        return timeServer.getTime(format);
    }
}
