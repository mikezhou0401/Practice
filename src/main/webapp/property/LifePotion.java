package main.webapp.property;

public class LifePotion extends Item{
    public void  effect(){
        System.out.println("血瓶使用后，可以回血");
    }
    public boolean disposable(){
        return true;
    }

}
