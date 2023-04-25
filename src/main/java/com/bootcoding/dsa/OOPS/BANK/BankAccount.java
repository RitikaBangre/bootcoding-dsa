package com.bootcoding.dsa.OOPS.BANK;

public class BankAccount {
    String BankName;
    String Address;
    public static void main(String []args){
        BankAccount bankAccount = new BankAccount();
        bankAccount.BankName = "Bank of Baroda";
        bankAccount.Address = "Nandanwan";

         Customer customer = new Customer();
        Customer cust = new Customer();
        cust.name = "Ramesh";
        cust.city = "Nagpur";
        cust.phone = 8935245224l;
        cust.email_Id = "ramesh2434@gmail.com";

        Account account = new Account();
        account.Balance = 1500000.00;
        account.AccountId = 3424245;
        account.Name ="Saving Account";
        }

            }


