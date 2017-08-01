package com.ezhik.domain;

public class Orc extends Monster {

    public Orc(int hp, int damage, boolean alive, int moneyLoot) {
        super(hp, damage, alive, "Orc", moneyLoot);
    }

    public Orc() {
        setRace("Orc");
    }
}
