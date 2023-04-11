package com.vicky;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DefaultToyMachine implements VendingToyMachine {
    private List<Toy> toyList = new ArrayList<>();
    private Random random = new Random();


    @Override
    public void addToy(Toy toy) {
        toyList.add(toy);
    }

    @Override
    public Toy getToy() {
        Toy obtainedToy = null;
        while(obtainedToy == null && !toyList.isEmpty()) {
            Class<? extends Toy> clazz = generateToyType();
            obtainedToy = toyList.stream()
                    .filter(clazz::isInstance)
                    .findFirst()
                    .orElse(null);
            if (obtainedToy != null)
                toyList.remove(obtainedToy);
        }
        return obtainedToy;
    }

    private Class<? extends Toy> generateToyType() {
        int p = random.nextInt(101);
        if (p <= Lego.LEGO_DROP_RATE) {
            return Lego.class;
        }
        if (p <= Robot.ROBOT_DROP_RATE + Lego.LEGO_DROP_RATE) {
            return Robot.class;
        }
        if (p <= Doll.DOLL_DROP_RATE + Robot.ROBOT_DROP_RATE + Lego.LEGO_DROP_RATE) {
            return Doll.class;
        }
        if (p <= SoftToy.SOFT_TOY_DROP_RATE + Doll.DOLL_DROP_RATE + Robot.ROBOT_DROP_RATE + Lego.LEGO_DROP_RATE) {
            return SoftToy.class;
        }
        return Car.class;

    }
}
