package main.webapp.multiplethread;

import java.util.*;

public class MyStack<T> {
    public LinkedList<T> l = new LinkedList<>();

    public synchronized void push(T t) {
        while (this.size() == 200) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        l.addLast(t);
        this.notify();
    }

    public synchronized T pull() {
        while (this.size() == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        T t = l.removeLast();
        this.notify();
        return t;
    }

    public synchronized T peek() {
        return l.getLast();
    }

    public synchronized int size() {
        return l.size();
    }

}
