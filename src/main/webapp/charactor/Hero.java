package main.webapp.charactor;

public  class  Hero{
    private int id;
    public String name="some hero";
    public float hp;
    float armor;
    int moveSpeed;
    static String copyright;//静态属性
    public Hero(){
        System.out.println("我是无参数构造函数");
        name="one hero";
    }
    public static Hero h1;

    public static Hero  geth1(){
        return h1;
    }

    public Hero(String name){
        System.out.println("我是带一个参数构造函数");
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
    public void attack(Hero hero ,float damage){
        hero.hp=hero.hp-damage;
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
    //胜利
    public static void battleWin(){
        System.out.println("我们胜利了");
        Hero dieHero=new Hero();
        dieHero.die();
    }
    //物品栏容量
    public static int itemCapacity=8;



    public  static  void main(String[] args){
//        Hero h=new Hero();
//        AdHero ad=new AdHero();
        //类型转换指的是把一个引用所指向的对象的类型，转换为另一个引用的类型

        //把ad引用所指向的对象的类型是ADHero
        //h引用的类型是Hero
        //把ADHero当做Hero使用，一定可以
//        h=ad;


//        父类转子类，有的时候行，有的时候不行，所以必须进行强制转换。
//        强制转换的意思就是 转换有风险，风险自担。

//        ad= (AdHero) h;


//        Support s=new Support();
//        h=s;
//        ad=(AdHero)h;

//        ADHero ad = new ADHero();
//        APHero ap = new APHero();
//
//        Hero h1= ad;
//        Hero h2= ap;
//
//        //判断引用h1指向的对象，是否是ADHero类型
//        System.out.println(h1 instanceof ADHero);
//
//        //判断引用h2指向的对象，是否是APHero类型
//        System.out.println(h2 instanceof APHero);
//
//        //判断引用h1指向的对象，是否是Hero的子类型
//        System.out.println(h1 instanceof Hero);



//        ADHero ad = new ADHero();
//           Hero h=ad;
//        AD adi = (AD) h;
//        APHero ap = (APHero) adi;




    }
}