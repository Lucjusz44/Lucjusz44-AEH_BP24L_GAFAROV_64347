public class myEighthApp {

    // Inner class Account
    static class Account {
        private String accountNumber;
        private double balance;
        private String ownerName;
        private String email;
        private String phoneNumber;

        public Account(String accountNumber, double balance, String ownerName, String email, String phoneNumber) {
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.ownerName = ownerName;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        // Getters
        public String getAccountNumber() { return accountNumber; }
        public double getBalance() { return balance; }
        public String getOwnerName() { return ownerName; }
        public String getEmail() { return email; }
        public String getPhoneNumber() { return phoneNumber; }

        // Setters
        public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
        public void setBalance(double balance) { this.balance = balance; }
        public void setOwnerName(String ownerName) { this.ownerName = ownerName; }
        public void setEmail(String email) { this.email = email; }
        public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

        // Methods
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposit of PLN " + amount + " was made. New balance PLN " + balance);
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew PLN " + amount + " from the account. Remaining balance = PLN " + balance);
            } else {
                System.out.println("Insufficient funds. You have PLN " + balance + " in your account.");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Account myAccount = new Account("1234567890", 1000.0, "Alice Nowak", "alice@example.com", "+48 987 654 321");

        myAccount.withdraw(900.0);
        myAccount.deposit(250.0);
        myAccount.withdraw(50.0);
        myAccount.withdraw(400.0); // Should display insufficient funds
    }
}
