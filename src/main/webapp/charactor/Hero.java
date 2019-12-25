package main.webapp.charactor;

import main.webapp.Mortal;
import main.webapp.property.Item;

public  class  Hero extends Object{
    private int id;
    public String name="some hero";
    public float hp;
    float armor;
    int moveSpeed=300;
    static String copyright;//静态属性
    public Hero(){
        System.out.println("hero的构造方法");
        name="one hero";
    }
    public static Hero h1;
    public static Hero  geth1(){
        return h1;
    }
    public Hero(String name){
        System.out.println("我是带一个参数Hero构造函数");
        this.name=name;
    }
    public Hero(String name ,float hp){
        this.name=name;
        this.hp=hp;
        System.out.println("我是带两个参数构造函数");

    }
    public Hero(String heroName, float heroHP,float heroArmor,int heroMoveSpeed){
        this(heroName,heroHP);
        this.name=heroName;
        this.hp=heroHP;
        armor=heroArmor;
        moveSpeed=heroMoveSpeed;
        System.out.println("我是带四个参数的构造函数");
    }
    public  void setName1(String name){
        this.name=name;
    }
    public  void setName2(String heroName){
            name=heroName;
    }
    public  void setName3(String name){
        this.name=name;
    }
    //回血
    public  void huixue(int xp){
        hp=hp+xp;
        xp=0;
    }
    //攻击一个英雄
    public void attack(Hero hero ,float damage) throws EnemyHeroIsDeadException {
       // hero.hp=hero.hp-damage;
        if (hero.hp<=0){
            throw new EnemyHeroIsDeadException(hero.name+"已经挂了");
        }

    }
      class  EnemyHeroIsDeadException extends Exception{
        public  EnemyHeroIsDeadException(){
        }
        public  EnemyHeroIsDeadException(String msg){
            super(msg);
        }
    }
    //死亡
    public  void die(){
        System.out.println("我死了");
    }
    //复活
    public void revive(Hero h){
        System.out.println(h.hp);
        h=new Hero("提莫",300);
        h.hp+=50;
        System.out.println(h.hp);
    }
    //物品栏容量
    public static int itemCapacity=8;
     //吃药
     public  void useItem(Item i){
         System.out.println("hero use item");
        i.effect();
     }
     //杀人
     public  void Kill(Mortal hero){
        hero.die();
     }
     //胜利了
     public static void battleWin(){
        System.out.println("Hero battle win");
     }

     public String toString(){
         return name;
     }
        public void finalize(){
         System.out.println("这个英雄正在被回收");
        }

    @Override
    public boolean equals(Object o) {
         if(o instanceof Hero){
             Hero h=(Hero) o;
             return this.hp==h.hp;
         }
         return false;
    }
    public  static  void main(String[] args){

        Hero galun=new Hero();
        Hero Timoo=new Hero();
        Timoo.hp=0;
        try{
            galun.attack(Timoo,100);
        } catch (EnemyHeroIsDeadException e) {
            System.out.println("异常的具体原因:"+e.getMessage());
            e.printStackTrace();
        }

    }


}
