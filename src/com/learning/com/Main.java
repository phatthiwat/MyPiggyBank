package com.learning.com;

public class Main {
    public static void main(String[] args) {
        PiggyBank piggyBankNongPorjai = new PiggyBank("น้องพอใจ");
        piggyBankNongPorjai.showMoney();
        piggyBankNongPorjai.addMoney(20);
        piggyBankNongPorjai.addMoney(50);
        piggyBankNongPorjai.showMoney();
    }
}
