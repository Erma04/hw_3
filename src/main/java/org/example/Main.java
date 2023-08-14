package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount= new BankAccount();
        bankAccount.deposit(15000);

            try {
                while (true) {
                    bankAccount.withDraw(6000);
                }
            } catch (LimitException e) {
                System.out.println("У вас на счете осталось " + e.getRemainingAmount() + " сом." + "Хотите снять?");
                try {
                    bankAccount.withDraw((int) e.getRemainingAmount());
                } catch (LimitException ex) {
                    System.out.println(ex.getMessage());
                }
            }

            System.out.println("На счете осталось: " + bankAccount.getAmount() + " сом");







    }
}