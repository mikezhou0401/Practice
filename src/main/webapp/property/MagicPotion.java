package main.webapp.property;

public class MagicPotion extends Item{
    public  void effect(){
        System.out.println("蓝瓶使用后，可以回魔法");
    }
    public void disposable(){

        System.out.println("随便说点");
    }
}
