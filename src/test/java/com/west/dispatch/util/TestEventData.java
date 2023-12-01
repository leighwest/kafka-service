package com.west.dispatch.util;

import com.west.dispatch.message.OrderCreated;

import java.util.UUID;

public class TestEventData {

    public static OrderCreated builderOrderCreatedEvent(UUID orderId, String item) {
        return OrderCreated.builder()
                .orderId(orderId)
                .item(item)
                .build();
    }
}
