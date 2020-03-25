package main.webapp.Date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {
    private  static SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public  static void main(String[] args) throws ParseException {
        /* 日期格式化
        Date[] d=new Date[9];
        String qian="2000/12/31 23:59:59";
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            long end=sdf.parse(qian).getTime();
            //long random=(long)(Math.random()*end);
            for (int i=0;i<d.length;i++){
                d[i]= new Date((long)(Math.random()*end));
                //System.out.println(i+"d[i]："+d[i]);
            }
            for (int i=0;i<d.length;i++){
                for(int j=i+1;j<d.length;j++){
                    Date tmp;
                    if(d[j].getTime()>d[i].getTime()){
                        tmp=d[i];
                        d[i]=d[j];
                        d[j]=tmp;
                    }
                }
            }

            for (int i=0;i<d.length;i++){
                System.out.print(d[i]+"     ");
                if(i%3==2){
                    System.out.println();
                }

            }

         */

        //日期Calendar
        Calendar c = Calendar.getInstance();
        Date now = c.getTime();
        c.setTime(now);
        c.add(Calendar.MONTH,2);
        System.out.println("下个："+format(c.getTime()));
        c.set(Calendar.DATE,-3);
        System.out.println("下个月的倒数第三天是："+format(c.getTime()));

    }
    private static  String format(Date time){
        return sdf.format(time);
    }


}
