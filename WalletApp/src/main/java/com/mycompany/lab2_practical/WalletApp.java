/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lab2_practical;

/**
 *
 * @author DELL
 */
public class WalletApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WalletImpl myWallet = new WalletImpl("W001" , 5000.0);
        
        ExchangeRateProvider provider = new ExchangeRateProviderImpl();
        
        myWallet.walletInfo();
        
        myWallet.loadMoney(500);
        myWallet.walletInfo();

        // Spend money
        myWallet.spendMoney(300);
        myWallet.walletInfo();

        // Convert currency
        double convertedAmount = myWallet.convertFund(200, "USD", "EUR", provider);

        System.out.println("Wallet Info after conversion:");
        myWallet.walletInfo();
    }
    
}
