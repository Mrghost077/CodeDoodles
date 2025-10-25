/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2_practical;

/**
 *
 * @author DELL
 */
public abstract class Wallet {
    String walletId;
    double currentBalance;
    
    public Wallet (String walletId, double amount){
        this.walletId = walletId;
        this.currentBalance = amount;
    }
    
    public abstract void loadMoney(double amount);
    public abstract void spendMoney(double amount);
   public  abstract void walletInfo();


}
