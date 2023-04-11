package com.vicky;

import java.util.UUID;

public class SoftToy extends Toy{
    public static final int SOFT_TOY_DROP_RATE = 25;
    public static final String SOFT_TOY_TOY_NAME = "Soft toy";

    protected SoftToy() {
        super(UUID.randomUUID(), SOFT_TOY_TOY_NAME, SOFT_TOY_DROP_RATE);
    }
}
