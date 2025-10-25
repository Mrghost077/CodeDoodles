/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2_practical;

/**
 *
 * @author DELL
 */
public class WalletImpl  extends Wallet {
    
    public WalletImpl (String walletId, double amount){
       super(walletId, amount); 
    }
    
    @Override
     public  void loadMoney(double amount){
          if(amount > 0){
              currentBalance += amount;
              System.out.println("Successfully Loaded " + amount);
          }else{
              System.out.println("Invalid amount");
          }
      }
    @Override
    public  void spendMoney(double amount){
         if (amount > 0 && amount < currentBalance){
             currentBalance -= amount;
             System.out.println(amount + " has been spent succesfully");
         }else{
             System.out.println("Insufficient fund or invalid amount");
         }
     }
    @Override
     public void walletInfo(){
         System.out.println("Wallet Id : " + walletId);
         System.out.println("Current Balance : " + currentBalance);
     }
     
     public double convertFund(double amount, String fromCurrency, String toCurrency, ExchangeRateProvider provider){
         double rate = provider.getRate(fromCurrency, toCurrency);
         double convertedAmount = amount * rate;
         System.out.println(amount + " in  " + fromCurrency + " is equal to " + convertedAmount +" in " + toCurrency);
         return convertedAmount;
     }
}
