package com.ezhik.domain;

public class Human extends Hero{
    public Human(int hp, int damage, boolean alive, int exp, int lvl, int money) {
        super(hp, damage, alive, "Human", exp, lvl, money);
    }

    public Human() {
        setRace("Human");
    }


}
