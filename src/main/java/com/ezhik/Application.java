package com.ezhik;

import com.ezhik.domain.*;

public class Application {
    public static void main(String[] args) {
        Hero hero = new Human();
        hero.setHp(10000);
        hero.setDamage(21);
        hero.setLvl(1);
        hero.setExp(0);

        Monster[] monsters = new Monster[3];
        monsters[0] = new Zombie(100, 10, true, 5);
        monsters[1] = new Orc(200, 5, true, 50);
        monsters[2] = new Zombie(100, 10, true, 5);

        Battle battle = new Battle(hero, monsters);
        battle.startBattle();

    }
}
