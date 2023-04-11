package com.vicky;

import java.util.UUID;

public class Car extends Toy {
    public static final int CAR_DROP_RATE = 30;
    public static final String CAR_TOY_NAME = "Car";

    public Car() {
        super(UUID.randomUUID(), CAR_TOY_NAME, CAR_DROP_RATE);

    }
}
