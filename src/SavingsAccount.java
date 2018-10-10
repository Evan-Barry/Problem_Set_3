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

    @Override
    public void lodge(double amount) {
       setBalance(getBalance() + amount);
   }

    @Override
    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }

    @Override
    public double calcTax() {

        if(getBalance() <= 34550)
        {
            return getBalance()* 0.2;
        }
        else
        {
            return getBalance() * 0.4;
        }
    }
}
