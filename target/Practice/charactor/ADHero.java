package main.webapp.charactor;

import main.webapp.AD;
import main.webapp.Mortal;
import main.webapp.property.Item;
import main.webapp.property.LifePotion;

public  class ADHero extends Hero implements AD, Mortal {
    int moveSpeed=400;

//

    public ADHero(String name){
        super(name);
        System.out.println("带一个参数的ADhero构造方法");
    }

    public int getMoveSpeed1(){
        return this.moveSpeed;
    }
    public int getMoveSpeed2(){
        return super.moveSpeed;
    }

        public  void  attack(){
            System.out.println(name+"发起了依次攻击");
            System.out.println();
        }
        public  void  attack(Hero ...heros){
            for(int i=0;i<heros.length;i++){
                System.out.println(name+"攻击了"+heros[i].name );
            }
            System.out.println();
        }

        public  void  die(){
            System.out.println("AD死了");
        }

        public static void battleWin(){
            System.out.println("ADHero battle win");
        }

    @Override
    public void useItem(Item i) {
        super.useItem(i);
    }

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    public static  void main(String[] args){

        ADHero ad=new ADHero("mike");
        LifePotion lp=new LifePotion();
        ad.useItem(lp);
    }
}

