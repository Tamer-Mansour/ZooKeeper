package com.example.zookeeper;

public class Mammal extends Animal {
    int energyLevel;

    public Mammal(String name,int energyLevel) {
        super(name);
        this.energyLevel=energyLevel;
    }

    public int displayEnergy( ){
        return  energyLevel;
    }
}
