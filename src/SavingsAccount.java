public class SavingsAccount extends BankAccount{

    private double balance;

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String toString()
    {
        return "Name: " + getName() + "\nAccount Number: " + getAccnum() + "\nBalance: " + String.format("€%.2f", getBalance());
    }

    public SavingsAccount(String name, int accnum, double balance)
    {
        setName(name);
        setAccnum(accnum);
        setBalance(balance);
    }
}
