package com.west.dispatch.service;

import com.west.dispatch.message.OrderCreated;
import com.west.dispatch.util.TestEventData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.util.UUID.randomUUID;

class DispatchServiceTest {

    private DispatchService service;


    @BeforeEach
    void setUp() {
        service = new DispatchService()
;    }

    @Test
    void process() {
        OrderCreated testEvent = TestEventData.builderOrderCreatedEvent(randomUUID(), randomUUID().toString());
        service.process(testEvent);
    }
}