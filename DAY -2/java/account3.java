
public class account3 {

    String accountNumber;
    double balance;

    public account3(String accountNumber, double balance) {

        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("error: account number cannot be null or empty..");
        } else {
            this.accountNumber = accountNumber;

        }

        if (balance < 0) {
            {

            }
            System.out.println("Error: Balance cannot be negative.");

        } else {
            this.balance = balance;

        }
    }

    public void displayShow(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {

        account3 validAccount = new account3("12345ABC", 1000.50);
        validAccount.displayShow();


        account3 invalidAccount1 = new account3("", 1000.50); 
        invalidAccount1.displayShow();


        account3 invalidAccount2 = new account3("67890XYZ", -500); 
        invalidAccount2.displayShow();
    }
}
