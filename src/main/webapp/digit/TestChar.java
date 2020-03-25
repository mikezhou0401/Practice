package main.webapp.digit;


public class TestChar{


    public  static void  main(String[] args){
        /*Scanner sc=new Scanner(System.in);
        String sc1=sc.next();

       char var[]=sc1.toCharArray();
       for (char v:var){
           System.out.println(v);
       }*/


        /*System.out.println("请输入字符：");
        Scanner sc=new Scanner(System.in);
        String sc1[]=new String[8];
        String max;
        for(int i=0;i<8;i++){
             sc1[i]=sc.next();
             //System.out.println(sc1[i].toCharArray()[0]);
        }
        for(int i=0;i<8;i++){
            for (int j=i+1;j<sc1.length;j++){
                if(Character.toLowerCase(sc1[j].toCharArray()[0])>Character.toLowerCase(sc1[i].toCharArray()[0])){
                    max=sc1[i];
                    sc1[i]=sc1[j];
                    sc1[j]=max;
                }
            }
            System.out.println(sc1[i].toString());
        }*/

        /*System.out.println("请输入字符：");
        Scanner sc=new Scanner(System.in);
        String sc1=sc.next();
        char sc2[]=new char[3];
        int count=0;

        //使用的多层for循环
        for(int i=1;i<'z';i++){
            for (int j=0;j<'z';j++){
                for(int k=0;k<'z';k++){
                    sc2[0]=(char)i;
                    sc2[1]=(char)j;
                    sc2[2]=(char)k;
                    count++;
                    StringBuffer str5 = new StringBuffer();
                    for (char s : sc2) {
                        str5.append(s);
                    }
                    if(str5.toString().equals(sc1)){
                        System.out.printf("密码是：%s%n",str5);
                        System.out.printf("一共循环了%d次",count);
                        return;
                    }
                }
            }
        }*/

        /*String str1="lengendary";
        char subString[]=str1.toCharArray();
        for(int i=0;i<subString.length;i++){
            if(i%2==0){
                char j=str1.toUpperCase().charAt(i);
                subString[i]=str1.toUpperCase().charAt(i);
            }
        }

        System.out.println(subString);*/

        String str="Nature has given us that two ears, two eyes," +
                " and but one tongue, to the end that we should hear and see more than we speak";
        char subString[]=str.toCharArray();
        subString[str.lastIndexOf("two")]=str.toUpperCase().charAt(str.lastIndexOf("two"));
        System.out.println(subString);



       // System.out.println(Arrays.toString(subString));








        //使用递归找规律
        //System.out.println("第40位是"+TestChar.show(3));

    }


   /* public static int show(int i){
        if(i<0){
            return 0;
        }
        else if(i>0&&i<2){
            return 1;
        }

        return show(i-1)+show(i-2);
    }*/


}
