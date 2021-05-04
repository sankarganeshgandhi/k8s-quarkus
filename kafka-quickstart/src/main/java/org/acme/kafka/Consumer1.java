package org.acme.kafka;

import io.smallrye.reactive.messaging.kafka.Record;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Consumer1 {
    private final Logger logger = Logger.getLogger(Consumer1.class);

    @Incoming("consumer1")
    //public void receiveMessage(Record<Integer, String> record) {
    public void receiveMessage(String msgEvent) {
        logger.infof("Got an event: %s", msgEvent);
    }
}