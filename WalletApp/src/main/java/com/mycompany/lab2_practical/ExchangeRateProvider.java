/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lab2_practical;

/**
 *
 * @author DELL
 */
public interface ExchangeRateProvider {
    double getRate(String fromCurrency, String toCurrency);
}
