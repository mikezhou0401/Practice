package main.webapp.charactor;

public class HelloWorld {
    public static void main(String[] args){
//        Season season= Season.SUMMER;
//        switch (season){
//            case SPRING:
//                System.out.println("春天");
//                break;
//            case SUMMER:
//                System.out.println("夏天");
//                break;
//            case AUTUMN:
//                System.out.println("秋天");
//                break;
//            case WINTER:
//                System.out.println("冬天");
//                break;
//        for (Season season:Season.values()){
//            System.out.println(season);
//        }
        for (HeroType type:HeroType.values())
            switch (type){
                case TANK:
                    System.out.println("坦克");
                    break;
                case WIZARD:
                    System.out.println("法师");
                    break;
                case ASSASSIN:
                    System.out.println("刺客");
                    break;
                case WARRIOR:
                    System.out.println("辅助");
                    break;
                case RANGED:
                    System.out.println("远程");
                    break;
                case PUSH:
                    System.out.println("推进");
                    break;
                case FARMING:
                    System.out.println("打野");
                    break;
            }



    }

}
