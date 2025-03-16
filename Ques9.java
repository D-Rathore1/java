
/*9. Write a java program to create a class named 'Bank ' with the following data members: 
Name of depositor Address of depositor Account Number Balance in account Class 'Bank' has a method for each of the following: 
1 - Generate a unique account number for each depositor For first depositor, 
account number will be 1001, for second depositor it will be 1002 and so on 
2 - Display information and balance of depositor 
3 - Deposit more amount in balance of any depositor 
4 - Withdraw some amount from balance deposited 
5 - Change address of depositor After creating the class, 
do the following operations 
1 - Enter the information (name, address, account number, balance) of the depositors. 
Number of depositors is to be entered by user. 
2 - Print the information of any depositor. 
3 - Add some amount to the account of any depositor and then display final information of that depositor 
4 - Remove some amount from the account of any depositor and then display final information of that depositor 
5 - Change the address of any depositor and then display the final information of that depositor 
6 - Randomly repeat these processes for some other bank accounts. */

import java.util.Scanner;

class Bank {
    static int count = 1001;
    String name;
    String address;
    int accountNumber;
    private double balance;

    public Bank(String name, String address, double balance) {
        this.name = name;
        this.address = address;
        this.accountNumber = count++;
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Balance: $" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Deposit failed.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully");
        } else {
            System.out.println("Invalid withdrawl amount");
        }
    }

    public void changeAddress(String newAddress) {
        this.address = newAddress;
        System.out.println("Address updated successfully");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public class BankSystem {
        public static void main(String[] args) {
            Scanner ip = new Scanner(System.in);
            System.out.println("Enter number of depositors: ");
            int n = ip.nextInt();
            ip.nextLine();
            Bank[] accounts = new Bank[n];
            int count = 0;
            while (true) {
                System.out.println("1. To Add a new account.");
                System.out.println("2. To Login.");
                System.out.println("1. Exit.");
                System.out.println("Enter your choice.");
                int ch = ip.nextInt();
                ip.nextLine();
                switch (ch) {
                    case 1:
                        if (count >= n) {
                            System.out.println("Cannot add more depositors.");
                            break;
                        }
                        System.out.println("Enter details for depositor " + (count + 1) + ":");
                        System.out.print("Name: ");
                        String name = ip.nextLine();
                        System.out.print("Address: ");
                        String address = ip.nextLine();
                        System.out.print("Initial Balance: ");
                        double balance = ip.nextDouble();
                        ip.nextLine();
                        accounts[count] = new Bank(name, address, balance);
                        System.out.println(
                                "Account created successfully. Account Number: " + accounts[count].getAccountNumber());
                        count++;
                        break;
                    case 2:
                        if (count == 0) {
                            System.out.println("No accounts available. Create an account first.");
                            break;

                        }
                        System.out.print("Enter account number (or -1 to go back): ");
                        int accNum = ip.nextInt();
                        ip.nextLine();
                        if (accNum == -1)
                            break;
                        Bank selectedAccount = null;
                        for (int i = 0; i < count; i++) {
                            if (accounts[i].getAccountNumber() == accNum) {
                                selectedAccount = accounts[i];
                                break;
                            }
                        }
                        if (selectedAccount == null) {
                            System.out.println("Account not found.");
                            break;
                        }
                        while (true) {
                            System.out.println("\nPress:");
                            System.out.println("1 - Display information of any depositor.");
                            System.out.println("2 - Deposit money.");
                            System.out.println("3 - Withdraw money.");
                            System.out.println("4 - Change address.");
                            System.out.println("5 - Logout.");
                            System.out.print("Enter your choice: ");
                            int choice = ip.nextInt();
                            ip.nextLine();
                            if (choice == 5)
                                break;
                            switch (choice) {
                                case 1:
                                    selectedAccount.displayInfo();
                                    break;
                                case 2:
                                    System.out.print("Enter deposit amount: ");
                                    double depositAmount = ip.nextDouble();
                                    ip.nextLine();
                                    selectedAccount.deposit(depositAmount);
                                    break;
                                case 3:
                                    System.out.print("Enter withdrawal amount: ");
                                    double withdrawAmount = ip.nextDouble();
                                    ip.nextLine();
                                    selectedAccount.withdraw(withdrawAmount);
                                    break;
                                case 4:
                                    System.out.print("Enter new address: ");
                                    String newAddress = ip.nextLine();
                                    selectedAccount.changeAddress(newAddress);
                                    break;
                                default:
                                    System.out.println("Invalid choice.");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Exiting system.");
                        ip.close();
                        return;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            }
        }
    }
}