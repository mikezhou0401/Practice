package main.webapp.multiplethread;


public class Consumer extends Thread {
        MyStack m;

    public Consumer(MyStack m) {
        this.m = m;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(this.getName()+"弹出:"+m.pull());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
