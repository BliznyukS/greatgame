package com.ezhik;

import com.ezhik.domain.Hero;
import com.ezhik.domain.Monster;

public class Battle {
    private Hero hero;
    private Monster[] monstersArray;

    public Battle(Hero hero, Monster[] monstersArray) {
        this.hero = hero;
        this.monstersArray = monstersArray;
    }

    public void startBattle() {
        int monstersAlive = monstersArray.length;

        while (hero.isAlive() && monstersAlive > 0) {
            System.out.println("Start turn");
            System.out.println("Hero" + hero);
            // ### for each перебор по всему массиву или коллекции ###
            //int result = heroKick(monstersAlive);
            //monstersAlive = result;

            monstersAlive = heroKick(monstersAlive);
            monstersKick();
        }
        System.out.println("Battle done!!!");
    }

    private int heroKick(int aliveMobs) {
        for (Monster monster : monstersArray) {
            //Если монстр мёртв тогда взять следующий елемент с помощью continue
            if (!monster.isAlive()) {
                continue;
            }
            int newHP = monster.getHp() - hero.getDamage();
            System.out.println("Hero Kicked " + monster.getRace() + "  " + monster.getHp() + " ---> " + newHP);
            monster.setHp(newHP);
            if (monster.getHp() <= 0) {
                System.out.println(monster.getRace() + " Dead");
                monster.setAlive(false);
                aliveMobs--;
            }
        }
        return aliveMobs;
    }

    private void monstersKick() {
        for (Monster monster : monstersArray) {
            if (monster.isAlive()) {
                int heroHP = hero.getHp() - monster.getDamage();
                System.out.println(monster.getRace() + " Kick hero, HP " + hero.getHp() + " ---> " + heroHP);
                hero.setHp(heroHP);
            }
            if (heroNotAlive()) return;
        }
    }

    private boolean heroNotAlive() {
        if (hero.getHp() <= 0) {
            System.out.println("Hero is dead...");
            return true;
        }
        return false;
    }

}
