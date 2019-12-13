package main.webapp.property;

public abstract class Item {
    String  name;
    int price;

    public static  Item it;
//    public static Item getIt(){
//        if(null==it){
//            it=new Item();
//        }
//        return it;
//    }

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

    //定义抽象方法
    public abstract void disposable();

    public static void main(String[] args){
        Item i=new Item() {
            @Override
            public void disposable() {
                System.out.println("我是内部类");
            }
        };
    }
}
