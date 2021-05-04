package org.acme.kafka;

import io.smallrye.reactive.messaging.kafka.Record;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class Producer1 {
    @Inject
    @Channel("producer1")
    //Emitter<Record<Integer, String>> emitter;
    Emitter<String> emitter;

    public void sendMessage(String msgEvent) {
        //emitter.send(Record.of(msgEvent.id, msgEvent.description));
        emitter.send(msgEvent);
    }
}