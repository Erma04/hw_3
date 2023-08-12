package org.example;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount+=sum;
    }

    public void withDraw(int sum) throws LimitException {
        if(sum>amount){
            throw new LimitException("Ошибка.Запрашиваемая сумма "+sum+ " сом больше чем остаток денег на счете",amount);
        }
        amount-=sum;

    }
}
