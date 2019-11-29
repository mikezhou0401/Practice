package main.webapp.charactor;

import main.webapp.AP;

public class APHero extends Hero implements AP {

    @Override
    public void magicAttack() {
        System.out.println("发动魔法攻击");
    }
}
