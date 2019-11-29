package main.webapp.charactor;

public class TestGiantDragon {
    public static void  main(String[] args){
        //通过new实例化会报错
       // GiantGragon g =new GiantGragon();
        GiantGragon g1=GiantGragon.getInstance();
        GiantGragon g2=GiantGragon.getInstance();
        GiantGragon g3=GiantGragon.getInstance();
        System.out.println(g1==g2);
        System.out.println(g2==g3);

    }
}
