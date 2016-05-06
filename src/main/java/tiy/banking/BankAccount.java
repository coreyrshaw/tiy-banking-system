package tiy.banking;

/**
 * Created by Corey Shaw on 5/6/2016.
 */
public class BankAccount {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private String id;
  private double balance;
}
