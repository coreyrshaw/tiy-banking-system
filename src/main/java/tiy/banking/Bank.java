package tiy.banking;

/**
 * Created by Corey Shaw on 5/6/2016.
 */
public class Bank {
    private String bankName;
    private double totalMoneyAtBank;

    public Customer[] getBankCustomer() {
        return bankCustomer;
    }

    public void setBankCustomer(Customer[] bankCustomer) {
        this.bankCustomer = bankCustomer;
    }

    public double getTotalMoneyAtBank() {
        return totalMoneyAtBank;
    }

    public void setTotalMoneyAtBank(double totalMoneyAtBank) {
        this.totalMoneyAtBank = totalMoneyAtBank;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    private Customer [] bankCustomer;
}
