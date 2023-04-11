package com.vicky;

import java.util.UUID;

public class Doll extends Toy{
    public static final int DOLL_DROP_RATE = 20;
    public static final String DOLL_TOY_NAME = "Doll";

    protected Doll() {
        super(UUID.randomUUID(), DOLL_TOY_NAME, DOLL_DROP_RATE);
    }
}

