#include <iostream>
using namespace std;

class Bank
{
    string name;
    double accNo;
    string type;
    int balance;

public:
    void initialize()
    {
        cout << "Enter (name,Account number,Type of account,Balance)\n";
        cin >> name >> accNo >> type >> balance;
    }
    void deposit(int amount)
    {
        balance += amount;
        cout << "Updated Balance : " << balance << endl;
    }
    void withdraw(int amount)
    {
        balance -= amount;
        cout << "Remaining Balance :" << balance << endl;
    }
    void display()
    {
        cout << "Name:"<< name;
        cout << "  Balance:"<< balance;
    }
};
int main(){
    Bank person;
    person.initialize();
    person.deposit(1000);
    person.withdraw(500);
    person.display();
    return 0;
}
