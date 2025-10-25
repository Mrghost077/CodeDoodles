/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2_practical;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class ExchangeRateProviderImpl implements ExchangeRateProvider {
    
    @Override
    public double getRate(String fromCurrency, String toCurrency){
        Random random = new Random();
        double rate = 0.5 + (0.5 * random.nextDouble());
        System.out.println("The Exchange rate from " + fromCurrency + " to " + toCurrency + " is " + rate);
        return rate;
    }
}
