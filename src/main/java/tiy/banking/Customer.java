package tiy.banking;

/**
 * Created by Corey Shaw on 5/6/2016.
 */
public class Customer extends Person {
private BankAccount[] bankAccounts;

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
