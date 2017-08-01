package com.ezhik.domain;

public abstract class Hero extends Unit{
    private int exp;
    private int lvl;
    private int money;

    public Hero() {
    }

    public Hero(int hp, int damage, boolean alive, String race, int exp, int lvl, int money) {
        super(hp, damage, alive, race);
        this.exp = exp;
        this.lvl = lvl;
        this.money = money;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "exp=" + exp +
                ", lvl=" + lvl +
                ", money=" + money +
                "} " + super.toString();
    }
}
