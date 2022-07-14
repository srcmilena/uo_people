package unit_04.ClassxObject;

public class Account {

    // instance variable
    private String name;
    private int accountNum;
    private double balance;

    // account constructor
    public Account(String initName, int initId, double initBalance) {

        name = initName;
        accountNum = initId;
        balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }
}
