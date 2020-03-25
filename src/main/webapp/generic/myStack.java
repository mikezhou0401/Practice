package main.webapp.generic;

import main.webapp.charactor.Hero;
import main.webapp.charactor1.Support;

import java.util.LinkedList;

public class myStack<T> {
    LinkedList<T> values = new LinkedList<>();

    public void push(T t) {
        values.addLast(t);
    }

    public T pull() {
        return values.removeLast();
    }

    public T peek() {
        return values.getLast();
    }

    public static void main(String[] args){
        myStack<Hero> myStack=new myStack<>();
        myStack.push(new Hero());
       // myStack.push(new Support());
        myStack.peek();

    }
}
