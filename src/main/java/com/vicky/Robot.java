package com.vicky;

import java.util.UUID;

public class Robot extends Toy{
    public static final int ROBOT_DROP_RATE = 15;
    public static final String ROBOT_TOY_NAME = "Robot";

    protected Robot(){
        super(UUID.randomUUID(), ROBOT_TOY_NAME, ROBOT_DROP_RATE);
    }
}
