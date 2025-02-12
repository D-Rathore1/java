#include <iostream>
#include <exception>
#include <vector>
using namespace std;

class myexception {
public:
    const char* what() const throw() {
        return "INSUFFICIENT BALANCE";
    }
};

class Bank {
private:
    int userID;
    int password;
    float balance;
    int accNO;

public:
    Bank() : userID(0), password(0), balance(0.0), accNO(0) {}

    void createACC() {
        cout << "ENTER THE USER ID : ";
        cin >> userID;
        cout << "ENTER THE PASSWORD : ";
        cin >> password;
        cout << "CONFIRM PASSWORD : ";
        int confirm;
        cin >> confirm;
        if (confirm == password) {
            cout << "INITIALIZE BALANCE : ";
            cin >> balance;
            cout << "ENTER ACC NO : ";
            cin >> accNO;
            cout << "ACCOUNT CREATED\n";
        } else {
            cout << "PASSWORD DOES NOT MATCH\n";
        }
    }

    void showBalance() {
        cout << "YOUR CURRENT BALANCE IS : " << this->balance << endl;
    }

    void transferMoney(vector<Bank>& users) {
        int otherAccNo;
        cout << "ENTER THE ACC NO OF THE USER YOU WANT TO TRANSFER TO: ";
        cin >> otherAccNo;

        for(int i = 0; i < users.size(); i++) {
            if(users[i].accNO == otherAccNo) {
                cout << "ENTER THE AMOUNT YOU WANT TO TRANSFER: ";
                float amount;
                cin >> amount;
                if (amount <= this->balance) {
                    this->balance -= amount;
                    users[i].balance += amount;
                    cout << "TRANSFER SUCCESSFUL\n";
                } else {
                    cout << "INSUFFICIENT BALANCE\n";
                }
                return;
            }
        }
        cout << "ACCOUNT NOT FOUND\n";
    }

    void addMoney() {
        cout << "ENTER AMOUNT TO ADD : ";
        float add;
        cin >> add;
        this->balance += add;
        cout << "TRANSACTION ADD SUCCESSFUL\n";
    }

    int getAccNo() const {
        return accNO;
    }

    int getUserID() const {
        return userID;
    }

    int getPassword() const {
        return password;
    }
};

int main() {
    vector<Bank> accounts;
    int choice;

    while (true) {
        cout << "1. CREATE ACCOUNT , 2. LOGIN , 3. EXIT\n";
        cin >> choice;

        switch (choice) {
        case 1:
            {
                Bank account;
                account.createACC();
                accounts.push_back(account);
                break;
            }
        case 2:
        {
            cout << "ENTER USER ID :" ;
            int id;
            cin >> id;
            cout << "ENTER PASSWORD :" ;
            int pass;
            cin >> pass;
            bool found = false;
            for (int i = 0; i < accounts.size(); i++) {
                if (accounts[i].getUserID() == id && accounts[i].getPassword() == pass) {
                    found = true;
                    cout << "LOGIN SUCCESSFUL\n";
                    int choice2;
                    while(true) {
                        cout << "1. CHECK BALANCE , 2. TRANSFER , 3. ADD MONEY , 4. LOGOUT\n";
                        cin >> choice2;
                        switch(choice2) {
                            case 1:
                                accounts[i].showBalance();
                                break;

                            case 2:
                                accounts[i].transferMoney(accounts);
                                break;

                            case 3:
                                accounts[i].addMoney();
                                break;

                            case 4:
                                cout << "LOGGING OUT...\n";
                                break;
                            
                            default:
                                cout << "INVALID OPTION\n";
                                break;
                        }
                        if (choice2 == 4) {
                            break;
                        }
                    }
                    break;
                }
            }
            if (!found) {
                cout << "INVALID USER ID OR PASSWORD\n";
            }
            break;
        }
        case 3:
            cout << "EXITING...\n";
            return 0;
        }
    }
}
