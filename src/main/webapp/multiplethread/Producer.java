package main.webapp.multiplethread;

import java.util.Random;

public class Producer extends Thread {
    MyStack m;
    public Producer(MyStack m) {
        this.m = m;
    }

    public static char get() {
        char[] cr = new char[26];
        Random random = new Random();
        int number = random.nextInt(cr.length);
        for (int i = 0; i < cr.length; i++) {
            cr[i] = (char) (i + 65);
        }
        return cr[number];
    }

    @Override
    public void run() {
        while (true) {
            char c=this.get();
            m.push(c);
            System.out.println(this.getName()+"压入:"+c);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

