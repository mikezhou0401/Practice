package main.webapp.charactor;

import main.webapp.Mortal;
import main.webapp.property.Item;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Hero extends Object {
    private int id;
    public String name = "some hero";
    public float hp;
    float armor;
    public int damage = 300;

    public Hero() {
        System.out.println("hero的构造方法");
        name = "one hero";
    }

    public static Hero h1;

    public static Hero geth1() {
        return h1;
    }

    public Hero(String name) {
        //System.out.println("我是带一个参数Hero构造函数");
        this.name = name;
    }

    public Hero(String heroName, float heroHP, int damage) {
        // this(heroName,heroHP);
        this.name = heroName;
        this.hp = heroHP;
        this.damage = damage;
    }

    //回血
    public void huixue(int xp) {
        hp = hp + xp;
        xp = 0;
    }

    //攻击一个英雄
    public void attack(Hero hero, float damage) throws EnemyHeroIsDeadException {
        // hero.hp=hero.hp-damage;
        if (hero.hp <= 0) {
            throw new EnemyHeroIsDeadException(hero.name + "已经挂了");
        }

    }


    class EnemyHeroIsDeadException extends Exception {
        public EnemyHeroIsDeadException() {
        }

        public EnemyHeroIsDeadException(String msg) {
            super(msg);
        }
    }

    //死亡
    public void die() {
        System.out.println("我死了");
    }

    //物品栏容量
    public static int itemCapacity = 8;

    //吃药
    public void useItem(Item i) {
        System.out.println("hero use item");
        i.effect();
    }

    public String toString() {
        return name + "的血量：" + hp + "," + "伤害：" + damage + "\n";
    }

    public void finalize() {
        System.out.println("这个英雄正在被回收");
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Hero) {
            Hero h = (Hero) o;
            return this.hp == h.hp;
        }
        return false;
    }

}
