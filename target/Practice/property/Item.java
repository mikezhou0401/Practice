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

    public String toString(){
        return name+price;
    }

    public void finalize(){
        System.out.println("这个对象正在被回收");
    }

    public boolean equals(Object o){
        if (o instanceof  Item){
           Item i=(Item) o;
           return this.price==i.price;
        }
        return false;
    }


    public  void  buy(){
        System.out.println("购买");
    }
    public  void  effect(){
        System.out.println("物品使用后，可以有效果");
    }

    public static void main(String[] args){
       Item i1=new Item();
       i1.name="负极斗篷";
       i1.price=500;

       System.out.println(i1.toString());
        Item i3;
       for(int x=0;x<10;x++){
           Item i2=new Item();
       }
         i3=new Item();
        i3.price=400;
        System.out.println(i1.equals(i3));
    }
}
