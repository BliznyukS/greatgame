package com.ezhik.domain;

public abstract class Unit {

    private int hp;
    private int damage;
    private boolean alive = true;
    private String race;

    public Unit() {
    }

    public Unit(int hp, int damage, boolean alive, String race) {
        this.hp = hp;
        this.damage = damage;
        this.alive = alive;
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return
                "hp=" + hp +
                ", damage=" + damage +
                ", alive=" + alive +
                ", race='" + race + '\''
                ;
    }
}
