package com.vicky;

import java.util.UUID;

public class Lego extends Toy{
    public static final int LEGO_DROP_RATE = 10;
    public static final String LEGO_TOY_NAME = "Lego";

    protected Lego() {
        super(UUID.randomUUID(), LEGO_TOY_NAME, LEGO_DROP_RATE);
    }
}
