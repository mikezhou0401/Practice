package main.webapp.generic;

import main.webapp.charactor.Hero;

import java.util.LinkedList;

public class HeroStack {
    LinkedList<Hero> heroes= new LinkedList<>();
    public void push(Hero h){
        heroes.addLast(h);
    }
    public Hero pull(){
      return   heroes.removeLast();
    }
    public Hero peek(){
        return  heroes.getLast();
    }

    public static void main(String[] args){
        HeroStack heroStack=new HeroStack();
        for(int i=0;i<5;i++){
            Hero h=new Hero("hero name"+i);
            System.out.println("压入 hero:"+h);
            heroStack.push(h);
        }
        for (int i = 0; i < 5; i++) {
            Hero h =heroStack.pull();
            System.out.println("弹出 hero" + h);
        }
    }
}
