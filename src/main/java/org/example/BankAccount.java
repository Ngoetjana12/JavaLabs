package org.example;

public class BankAccount {

    private String name;
    private String accNumber;
    private double balance;

    BankAccount(String _name, String _accNumber, double _balance){

        name = _name;
        accNumber =_accNumber;
        balance = _balance;
    }

    void deposit(double depositAmt){

        if(depositAmt > 0){
            this.balance += depositAmt;
            System.out.println("R"+ depositAmt + " Deposited!");
        }else{
            System.out.println("Invalid Transaction");
        }

    }
    void withdraw(double withdrawAmt){

        if(withdrawAmt > this.balance && withdrawAmt < 0){
            System.out.println("Insufficient funds");
        }else{
            this.balance -= withdrawAmt;
            System.out.println("R"+ withdrawAmt + "Withdrawn");
        }

    }
    void getBalance(){

        System.out.println("Balance: R" + this.balance);
    }

}
