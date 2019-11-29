package main.webapp.charactor1;
import main.webapp.Healer;
import main.webapp.charactor.Hero;

public class Support extends Hero implements Healer {


    @Override
    public void heal(){
            System.out.println("奶一口");
    }

}
