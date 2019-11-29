package main.webapp.charactor;

public class GiantGragon {
    //私有化构造方法使得该类无法咋外部通过new进行实例化
    private GiantGragon(){

    }
    //准备一个类属性，指向一个实例化对象。因为是类属性，所以只有一个
    private  static GiantGragon instance;
    public static   GiantGragon getInstance(){
        if(null==instance) {
            instance=new GiantGragon();
        }
        return instance;
    }
}
