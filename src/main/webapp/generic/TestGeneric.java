package main.webapp.generic;
import main.webapp.charactor.Hero;

import java.util.ArrayList;

public class TestGeneric {
    public static void iterate(ArrayList<? extends Hero> heroList) {
        for (Hero hero : heroList) {
            System.out.println(hero.name);
        }
    }

    public static void main(String[] args) {
        ArrayList<? extends Hero> heroList = new ArrayList<>();
        TestGeneric.iterate(heroList);

    }
}
