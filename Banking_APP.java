package com.company;

import java.util.Scanner;

//creating main class
public class Banking_APP {

    //creating main function
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // make input possible

        //creating account
        System.out.println("Choose your account name ");
        String accountName = in.nextLine();
        account account_Name = new account(accountName, "A00001");
        account_Name.showMenu();

    }
}
