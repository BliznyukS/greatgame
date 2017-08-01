package com.ezhik.domain;

public class Zombie extends Monster {

    public Zombie(int hp, int damage, boolean alive, int moneyLoot) {
        super(hp, damage, alive, "Zombie", moneyLoot);
    }

    public Zombie() {
        setRace("Zombie");
    }

    /**
     * Zombie ia weak mob so he does half damage
     * @return
     */
    @Override
    public int getDamage() {
        System.out.println("##Zombie overriden kick###");
        return super.getDamage() / 2;
    }
}
