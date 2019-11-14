#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.manager.dubbo.consumer;

import ${package}.api.TimeServer;
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
