package main.webapp.exception;

import java.util.Scanner;

/**
 * 支票账户
 * */
public class CheckingAccount extends Account{
    float overdraftProtection=100;
    public CheckingAccount(float balance) {
        super(balance);
    }
     float withdraw(float money) throws OverdraftException {
      float  deficit=money-balance-overdraftProtection;
        if (money>balance+overdraftProtection){
            throw new OverdraftException("超过透支额度"+deficit);
        }
        if (money>balance&& money<balance+overdraftProtection){
            balance= 0;
            overdraftProtection=overdraftProtection-(money-balance);
        }else if (money<balance){
             balance= balance+overdraftProtection-money;
         }
        return balance;

    }



    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("你存入的金额:");
        float money1 = sc.nextFloat();
        CheckingAccount ca=new CheckingAccount(money1);
        try {
            ca.withdraw(200);
        } catch (OverdraftException e) {
            e.printStackTrace();
        }


    }
}
