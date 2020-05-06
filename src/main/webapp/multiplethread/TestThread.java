package main.webapp.multiplethread;

import main.webapp.charactor.Hero;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestThread  {



    public static void main(String[] args) {
        MyStack m = new MyStack();
        Producer p1 = new Producer(m);
        p1.setName("Producer1");
        Producer p2 = new Producer(m);
        p2.setName("Producer2");
        Consumer c1 = new Consumer(m);
        c1.setName("Consumer1");
        Consumer c2 = new Consumer(m);
        c2.setName("Consumer2");
        Consumer c3 = new Consumer(m);
        c3.setName("Consumer3");
        p1.start();
        p2.start();
        c1.start();
        c2.start();
        c3.start();

    }


}