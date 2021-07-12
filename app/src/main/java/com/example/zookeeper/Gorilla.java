package com.example.zookeeper;

class Gorilla extends Mammal {

    public Gorilla(String name, int energyLevel) {
        super(name, energyLevel);
    }

    public void throwSomething(){
        energyLevel+=5;
    }
    public void eatBananas(){
        energyLevel+=10;

    }
    public void climb(){
        energyLevel-=10;
    }
    
}