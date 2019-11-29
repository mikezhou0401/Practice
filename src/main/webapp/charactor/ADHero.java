package main.webapp.charactor;
import main.webapp.AD;

public  class ADHero extends Hero implements AD {

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


    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}

