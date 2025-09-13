class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("John Doe", "ACC12345", 5000);

        acc.displayBalance();
        System.out.println("--------------------");
        
        acc.deposit(2000);
        acc.displayBalance();
        System.out.println("--------------------");
        
        acc.withdraw(1500);
        acc.displayBalance();
        System.out.println("--------------------");
        
        acc.withdraw(7000); 
    }
}

