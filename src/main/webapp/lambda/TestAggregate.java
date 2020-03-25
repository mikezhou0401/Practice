package main.webapp.lambda;

import main.webapp.charactor.Hero;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;

public class TestAggregate {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heroes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            heroes.add(new Hero("hero" + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化集合后的数据（最后一个数据重复）：");
        System.out.println(heroes);
        System.out.println("筛选出hp>100 && damage<50的英雄");
        filter(heroes,h -> h.hp>100 && h.damage<50);
    }

    public static void filter(List<Hero> heroes, HeroChecker checker) {
        for (Hero hero : heroes) {
            if (checker.test(hero)) {
                System.out.println(hero);
            }
        }
    }
}
