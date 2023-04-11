package com.vicky;

import java.util.UUID;

public abstract class Toy {
     UUID id;
     String name;
     int toyDropRate;

    protected Toy(UUID id, String name, int toyDropRate) {
        this.id = id;
        this.name = name;
        this.toyDropRate = toyDropRate;
           }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getToyDropRate() {
        return toyDropRate;
    }

    public void setToyDropRate(int toyDropRate) {
        this.toyDropRate = toyDropRate;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", toyDropRate=" + toyDropRate +
                '}';
    }
}
