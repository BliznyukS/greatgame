package com.ezhik.domain;

public abstract class Monster extends Unit {
    private int moneyLoot;

    public Monster() {
    }

    public Monster(int hp, int damage, boolean alive, String race, int moneyLoot) {
        super(hp, damage, alive, race);
        this.moneyLoot = moneyLoot;
    }

    public int getMoneyLoot() {
        return moneyLoot;
    }

    public void setMoneyLoot(int moneyLoot) {
        this.moneyLoot = moneyLoot;
    }


}
