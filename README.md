# CodeDoodles
# WalletApp – OOD Lab2 2024

Welcome to **WalletApp**, a Java project built for **Object-Oriented Design Lab 2 (2024)**.  
This project demonstrates a digital wallet application that handles multiple currencies, allows loading and spending money, and simulates currency conversion using a random exchange rate provider.

---

## **Assignment Overview / Questions**

You are tasked to create a **digital wallet application** in Java with the following requirements:

1. **Abstract Class `Wallet`**  
   - Properties:
     - `walletId` (String) – unique identifier for the wallet  
     - `balance` (double) – current balance  
   - Abstract Methods:
     - `loadMoney(double amount)` – add money to the wallet  
     - `spendMoney(double amount)` – spend money from the wallet  
     - `displayWalletInfo()` – show wallet ID and balance  

2. **Interface `ExchangeRateProvider`**  
   - Method:
     - `getRate(String fromCurrency, String toCurrency)` – fetch exchange rate for conversion  

3. **Class `WalletImpl`**  
   - Extends `Wallet`  
   - Implements abstract methods  
   - Adds `convertFunds(double amount, String fromCurrency, String toCurrency, ExchangeRateProvider provider)` for currency conversion  

4. **Class `ExchangeRateProviderImpl`**  
   - Implements `ExchangeRateProvider`  
   - Simulates fetching exchange rates using a random number generator between 0.5 and 1.0  

5. **Class `WalletApp`**  
   - Contains `main()`  
   - Demonstrates the wallet functionality:  
     - Create a wallet with an initial balance  
     - Load and spend money  
     - Convert currency using `convertFunds()`  
     - Display wallet information  

Happy doodling! 🚀
