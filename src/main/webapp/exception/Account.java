package main.webapp.exception;

import java.util.Scanner;

//银行账号
public class Account {
    //余额
    float balance = 0;
    public Account( float balance) {
        this.balance = balance;
    }

    //获得余额
    float getBalance() {
        return this.balance;
    }

    float deposit(float money) {
        balance += money;
        return balance + money;
    }

    float withdraw(float money) throws OverdraftException {
            float deficit = money - balance;
        if (money > balance) {
            throw new OverdraftException("透支" + deficit);
        }
        balance += money;
        return balance - money;
    }

    class OverdraftException extends Exception {
        public OverdraftException() {
        }

        public OverdraftException(String msg) {
            super(msg);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("你存入的金额:");
        float money1 = sc.nextFloat();
        Account a = new Account(money1);
        System.out.println(a.getBalance());
        try {
            System.out.print("请输入想取的金额:");
            float money2 = sc.nextFloat();
            a.withdraw(money2);
        } catch (OverdraftException e) {
            e.printStackTrace();
        }


    }
}
