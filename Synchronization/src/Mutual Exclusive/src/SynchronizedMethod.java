class BankTransactionOfCompany {
    int creditAmount = 1000000;

    // Resources
    // Synchronized Method
    synchronized void Transaction(int debitAmount) {
        if (debitAmount <= creditAmount) {
            System.out.println("Tansaction completed of " + debitAmount);
            creditAmount = creditAmount - debitAmount;
            System.out.println("Credit Balance is " + creditAmount);
        } else {
            System.out.println("Transaction failed");
            System.out.println("Credit amount " + creditAmount);
        }
    }
}

public class SynchronizedMethod extends Thread {

    static BankTransactionOfCompany transaction;
    int debit;

    public void run() {

        transaction.Transaction(debit);

    }

    public static void main(String[] args) {

        transaction = new BankTransactionOfCompany();
        SynchronizedMethod salary = new SynchronizedMethod();
        salary.debit = 200000;
        salary.start();

        SynchronizedMethod officeEquipments = new SynchronizedMethod();
        officeEquipments.debit = 500000;
        officeEquipments.start();

        SynchronizedMethod tax = new SynchronizedMethod();
        tax.debit = 100000;
        tax.start();

        SynchronizedMethod rent = new SynchronizedMethod();
        rent.debit = 300000;
        rent.start();

    }
}
