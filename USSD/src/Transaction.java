public class Transaction extends Account implements IUSSD
{
    private String Account_No;

    private double balance;

    public Transaction()
    {
    }

    public Transaction(String Account_No,String name,double balance, String password)
    {
        this.Account_No = Account_No;
        super.name = name;
        if(balance > 0.0)
            this.balance = balance;
        super.password = password;
    }
    public String getAccount_No()
    {
        if(Account_No.length() == 10)
        {
            return Account_No;
        }
        else
            return null;
    }
    public String getPassword()
    {
        if(password.length() == 5)
        {
            return password;
        }
        else{
            return null;
        }
    }

    public void deposit(double depositAmount)
    {
        if(depositAmount >0.0)
            balance = balance + depositAmount;
    }

    public void withdraw(double withdrawMoney)
    {
        if(withdrawMoney >= 30) {
            balance = balance - withdrawMoney;
        }
    }

    public void SendMoney(double SendMoney)
    {
        if(SendMoney >= 30) {
            balance = balance - SendMoney;
        }

    }
    public double getBalance()
    {
        return balance;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
