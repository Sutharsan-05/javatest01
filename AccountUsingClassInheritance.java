
// Account Using Class with Inheritance

class Account {
    protected String name;
    protected int acc_no;
    protected int balance;

    Account(String n, int ac_no, int bal) {
        this.name = n;
        this.acc_no = ac_no;
        this.balance = bal;
    }
}

class Transaction extends Account {

    Transaction(String n, int ac_no, int bal) {
        super(n, ac_no, bal);
    }

    int deposit(int dep) {
        balance = balance + dep;
        return balance;
    }

    int withdraw(int amt) {
        if (amt > balance) {
            System.out.println("Insufficient Balance");
            return balance;
        }

        balance = balance - amt;
        return balance;
    }

    void display() {
        System.out.println("Account Name    : " + name);
        System.out.println("Account Number  : " + acc_no);
        System.out.println("Current Balance : " + balance);
    }
}

public class AccountUsingClassInheritance {
    public static void main(String[] args) {

        Transaction p = new Transaction("Sky", 190890101, 300);

        System.out.println("Balance After Deposit : " + p.deposit(500));
        System.out.println("Balance After Withdraw: " + p.withdraw(500));

        System.out.println("\nAccount Details");
        p.display();
    }
}