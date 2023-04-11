package com.vicky;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        VendingToyMachine vendingToyMachine = new DefaultToyMachine();
        vendingToyMachine.addToy(new Car());
        vendingToyMachine.addToy(new Car());
        vendingToyMachine.addToy(new Car());
        vendingToyMachine.addToy(new Car());
        vendingToyMachine.addToy(new Car());
        vendingToyMachine.addToy(new Robot());
        vendingToyMachine.addToy(new Robot());
        vendingToyMachine.addToy(new Lego());
        vendingToyMachine.addToy(new Lego());
        vendingToyMachine.addToy(new Lego());
        vendingToyMachine.addToy(new Doll());
        vendingToyMachine.addToy(new Doll());
        vendingToyMachine.addToy(new Doll());
        vendingToyMachine.addToy(new Doll());
        vendingToyMachine.addToy(new SoftToy());
        vendingToyMachine.addToy(new SoftToy());
        vendingToyMachine.addToy(new SoftToy());
        vendingToyMachine.addToy(new SoftToy());
        ToyCSVWriter toyCSVWriter = new DefaultToyCSVWriter();
        for (int i = 0; i < 20; i++) {
            Toy toy = vendingToyMachine.getToy();
            if (toy != null) {
                System.out.println(toy);
                toyCSVWriter.writeToyToCsv(toy);
            } else {
                System.out.println("Игрушки закончились!");
            }
        }

    }

}

