package com.company;

import java.util.Scanner;

public class account {
    //define variables
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    //Class constructor
    account(String cname, String cid) {
        customerName = cname;
        customerID = cid;
    }

    //deposit function
    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            previousTransaction = amount;
        }
        else {
            System.out.println("Amount not correct; try again");
        }
    }

    //withdraw function
    void withdraw(int amount) {
        if (amount < 0) {
            balance -= amount;
            previousTransaction = -amount;
        }
        else {
            System.out.println("Amount not correct; try again");
        }
    }

    //show prev trans
    void getPrevTrans() {
        if (previousTransaction > 0) {
            System.out.println("You deposited an amount of " + previousTransaction + " dollars$$");
        }
        else if (previousTransaction < 0) {
            System.out.println("You withdrew an amount of " + previousTransaction + " dollars :(");
        }
        else {
            System.out.println("You have yet to make any transactions");
        }
    }

    //calc interest
    void calcInterest(int years) {
        double interestRate = .038;
        double newBalance = balance + (balance * interestRate * years);
        System.out.println("The current interest rate is " + 100*interestRate);
        System.out.println("After " + years + " years you will have " + newBalance);
    }

    //show main menu
    void showMenu() {
        char option;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerID);
        System.out.println();
        System.out.println("What would you like to do ?");
        System.out.println();
        System.out.println("A. Check your balance");
        System.out.println("B. make a deposit");
        System.out.println("C. Make a withdraw");
        System.out.println("D. View your previous transaction");
        System.out.println("E. Calculate interest rate");
        System.out.println("F. Exit");

        do {
            System.out.println();
            System.out.println("Enter your desired option: ");
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            //check what option
            switch (option) {
                case 'A':
                    System.out.println("=====================================================");
                    System.out.println("Your balance is " + balance);
                    System.out.println("=====================================================");
                    System.out.println();
                    break;

                case 'B':
                    System.out.println("Enter your desired deposit amount");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("Successful deposit");
                    System.out.println();
                    break;

                case 'C':
                    System.out.println("Enter your desired withdraw amount");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("Successful withdraw");
                    System.out.println();
                    break;

                case 'D':
                    System.out.println("=====================================================");
                    getPrevTrans();
                    System.out.println("=====================================================");
                    System.out.println();
                    break;

                case 'E':
                    System.out.println("Enter amount of years for interest calculation: ");
                    int years = scanner.nextInt();
                    calcInterest(years);
                    break;

                case 'F':
                    System.out.println("=========================================================================================");
                    break;

                default:
                    System.out.println("Error' you entered an invalid option");
                    break;
            }


        } while (option != 'F');
        System.out.println("Have a nice day!");


    }


}
