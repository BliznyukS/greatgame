package com.ezhik.domain;

public class Elf extends Hero {
    public Elf(int hp, int damage, boolean alive, int exp, int lvl, int money) {
        super(hp, damage, alive, "Elf", exp, lvl, money);
    }

    public Elf() {
        setRace("Elf");
    }
}
