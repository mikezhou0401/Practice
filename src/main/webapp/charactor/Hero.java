package main.webapp.charactor;

import main.webapp.Mortal;
import main.webapp.property.Item;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Hero {
    public String name;
    public float hp;
    public int damage;


    //攻击一个英雄
    public void attackHero(Hero h) {

        h.hp -= damage;

        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n", name, h.name, h.name, h.hp);
        if (h.isDead()) {
            System.out.format(h.name + "死了");
        }

    }

    public synchronized void hurt() {
        if (hp == 1) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        hp = hp - 1;
        this.notify();
        System.out.println("盖伦的当前血量是：" + this.hp);
    }

    public synchronized void recover() {
        if (hp == 616) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        hp = hp + 1;
        this.notify();
        System.out.println("盖伦的当前血量是：" + this.hp);
    }

    public boolean isDead() {
        return 0 >= hp ? true : false;
    }
}
