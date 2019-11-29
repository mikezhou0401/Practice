package main.webapp.property;

public class Item {
    String  name;
    int price;

    public static  Item it;
    public static Item getIt(){
        if(null==it){
            it=new Item();
        }
        return it;
    }


    public  void  buy(){
        System.out.println("购买");
    }
    public  void  effect(){
        System.out.println("物品使用后，可以有效果");
    }

    public static void main(String[] args){
        Item i1=new LifePotion();
        Item i2=new MagicPotion();
        System.out.println("i1 是Item类型，执行effect打印");

    }
}
