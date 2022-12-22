public class Transaction extends Account implements IUSSD
{
    private double send_money;
    private double withdraw;
    public Transaction()
    {
    }

    public Transaction(String name_Surname,String account_No,String password,double balance,double send_money, double withdraw)
    {
        super.name_Surname = name_Surname;
        super.account_No = account_No;
        super.password  = password;
        super.balance = balance;
        this.send_money = send_money;
        this.withdraw = withdraw;
    }
    public double getbalance()
    {
        return balance;
    }
    public double getSendMoney()
    {
        return send_money;
    }
    public double getWihdraw()
    {
        return withdraw;
    }
    public String getPassword()
    {
        return password;
    }
    public String getNameSurname()
    {
        return name_Surname;
    }
    public String getAccount_No()
    {
        return account_No;
    }
    public double calc()
    {
        double numb = balance - send_money;
        return numb;
    }
    public String toString()
    {
        String str = String.format(super.toString(), send_money, withdraw);
        return str;
    }
}

